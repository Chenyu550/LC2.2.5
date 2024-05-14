package emu.lunarcore.server.http.handlers;

import org.jetbrains.annotations.NotNull;

import emu.lunarcore.LunarCore;
import emu.lunarcore.game.account.Account;
import emu.lunarcore.game.account.AccountHelper;
import emu.lunarcore.server.http.objects.LoginAccountReqJson;
import emu.lunarcore.server.http.objects.LoginResJson;
import emu.lunarcore.server.http.objects.LoginResJson.VerifyData;
import emu.lunarcore.util.JsonUtils;
import io.javalin.http.ContentType;
import io.javalin.http.Context;
import io.javalin.http.Handler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

public class UsernameLoginHandler implements Handler {

    public UsernameLoginHandler() {

    }

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        // Setup response
        LoginResJson res = new LoginResJson();

        if (LunarCore.getConfig().getDeviceAuthData().useDeviceAuth) {
            String deviceId = ctx.header("x-rpc-device_id");
            String language = ctx.header("x-rpc-language");

            URL url = new URL(LunarCore.getConfig().getDeviceAuthData().getEndpointUrl() + "/login?deviceId=" + deviceId);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");

            StringBuilder result = new StringBuilder();

            try (BufferedReader reader = new BufferedReader( new InputStreamReader(conn.getInputStream()))) {
                for (String line; (line = reader.readLine()) != null; ) {
                    result.append(line);
                }
            }

            if (result.toString().equals("failed")) {
                res.retcode = -202;
                if (Objects.equals(language, "zh-cn")) {
                    res.message = "設備驗證失敗\n設備ID：" + deviceId;
                } else {
                    res.message = "Device verification failed\nDevice ID: " + deviceId;
                }
                ctx.contentType(ContentType.APPLICATION_JSON);
                ctx.result(JsonUtils.encode(res));
                return;
            }
        }

        // Parse request
        LoginAccountReqJson req = JsonUtils.decode(ctx.body(), LoginAccountReqJson.class);

        // Validate
        if (req == null) {
            res.retcode = -202;
            res.message = "Error logging in";
            return;
        }

        // Login - Get account data
        Account account = LunarCore.getAccountDatabase().getObjectByField(Account.class, "username", req.account);

        if (account == null) {
            // Auto create an account for the player if allowed in the config
            if (LunarCore.getConfig().getServerOptions().autoCreateAccount) {
                account = AccountHelper.createAccount(req.account, null, 0);
            } else {
                res.retcode = -201;
                res.message = "Username not found.";
            }
        }

        if (account != null) {
            res.message = "OK";
            res.data = new VerifyData(account.getUid(), account.getEmail(), account.generateDispatchToken());
        }

        // Send result
        ctx.contentType(ContentType.APPLICATION_JSON);
        ctx.result(JsonUtils.encode(res));
    }

}
