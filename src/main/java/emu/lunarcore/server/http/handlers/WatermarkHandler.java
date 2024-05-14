package emu.lunarcore.server.http.handlers;

import emu.lunarcore.LunarCore;
import emu.lunarcore.server.http.objects.WatermarkReqJson;
import emu.lunarcore.server.http.objects.WatermarkResJson;
import emu.lunarcore.util.JsonUtils;
import io.javalin.http.ContentType;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class WatermarkHandler implements Handler {

    public WatermarkHandler() {

    }
    
    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        WatermarkResJson res = new WatermarkResJson();
        res.retcode = 0;
        res.message = "OK";
        
        WatermarkReqJson json = JsonUtils.decode(ctx.body(), WatermarkReqJson.class);
        res.data.url = LunarCore.getConfig().getWatermarkData().watermarkUrl + "?width=" + json.width + "&height=" + json.height;

        LunarCore.getLogger().info("Watermark generated for IP: " + ctx.ip());
        
        ctx.contentType(ContentType.APPLICATION_JSON);
        ctx.result(JsonUtils.encode(res));
    }
}
