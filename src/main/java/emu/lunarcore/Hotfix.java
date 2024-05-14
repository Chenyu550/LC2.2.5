package emu.lunarcore;

import java.util.*;

import com.google.gson.annotations.SerializedName;

import emu.lunarcore.data.common.ItemParam;
import lombok.Getter;

@Getter
public class Hotfix {
    
    public HostNameData hostName = new HostNameData();
    public Map<String, LinksData> links = Map.ofEntries(
        Map.entry("2.1.52", new LinksData())
    );

    @Getter
    public static class HostNameData {
        public String CN = "https://autopatchcn.bhsr.com";
        public String OS = "https://autopatchos.starrails.com";
    }

    @Getter
    public static class LinksData {
        public String assetBundleUrl = "";
        public String exResourceUrl = "";
        public String luaUrl = "";
        public String ifixUrl = "";
    }

    public void validate() {
    }
}
