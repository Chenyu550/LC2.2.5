package emu.lunarcore.server.http.handlers;

import org.jetbrains.annotations.NotNull;

import emu.lunarcore.LunarCore;
import emu.lunarcore.proto.GateserverOuterClass.Gateserver;
import emu.lunarcore.util.Utils;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class QueryGatewayHandler implements Handler {

    public QueryGatewayHandler() {

    }

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        // Get streaming data from config
        var data = LunarCore.getConfig().getDownloadData();

        // Build gateserver proto
        Gateserver gateserver = Gateserver.newInstance()
            .setRegionName(LunarCore.getConfig().getGameServer().getId())
            .setIp(LunarCore.getConfig().getGameServer().getPublicAddress())
            .setPort(LunarCore.getConfig().getGameServer().getPublicPort())
            .setMsg("Access verification failed. Please check if you have logged in to the correct account and server.") // in case there is some error idk
            .setUseTcp(false)
            .setUnk1(true)
            .setUnk2(true)
            .setUnk3(true)
            .setUnk4(true)
            .setUnk5(true)
            .setUnk6(true)
            .setUnk7(true);
        
        if (ctx.queryParam("version") != null) {
            var version = ctx.queryParam("version").replace("CN", "").replace("OS", "");
            version = version.replace("BETA", "").replace("PROD", "");
            version = version.replace("Android", "").replace("Win", "").replace("iOS", "");
            
            var region = ctx.queryParam("version").contains("CN") ? LunarCore.getHotfix().getHostName().getCN() : LunarCore.getHotfix().getHostName().getOS();
            var hotfix = LunarCore.getHotfix().getLinks().get(version);

            if (hotfix.assetBundleUrl != null) {
                gateserver.setAssetBundleUrl(hotfix.getAssetBundleUrl().replace("{HOSTNAME}", region));
            }
            if (hotfix.exResourceUrl != null) {
                gateserver.setExResourceUrl(hotfix.getExResourceUrl().replace("{HOSTNAME}", region));
            }
            if (hotfix.luaUrl != null) {
                var luaUrl = hotfix.getLuaUrl().replace("{HOSTNAME}", region);
                gateserver.setLuaUrl(luaUrl);
                gateserver.setMdkResVersion(
                    luaUrl.split("/")[luaUrl.split("/").length - 1].split("_")[1]
                );
            }
            if (hotfix.ifixUrl != null) {
                var ifixUrl = hotfix.getIfixUrl().replace("{HOSTNAME}", region);
                gateserver.setIfixUrl(ifixUrl);
                gateserver.setIfixVersion(
                    ifixUrl.split("/")[ifixUrl.split("/").length - 1].split("_")[1]
                );
            }
        }

        // Log
        if (LunarCore.getConfig().getLogOptions().connections) {
            LunarCore.getLogger().info("Client request: query_gateway");
        }

        // Encode to base64 and send to client
        ctx.result(Utils.base64Encode(gateserver.toByteArray()));
    }

}
