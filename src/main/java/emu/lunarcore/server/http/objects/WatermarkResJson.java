package emu.lunarcore.server.http.objects;

public class WatermarkResJson {
    public int retcode = 0;
    public String message = "OK";
    public static class Data {
        public String url = "http://127.0.0.1/watermark?width=1920&height=1080";
    }
    public Data data = new Data();
}
