package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.GetWolfBroGameDataScRspOuterClass.GetWolfBroGameDataScRsp;
import emu.lunarcore.proto.WolfBroGameDataOuterClass.WolfBroGameData;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetWolfBroGameDataScRsp extends BasePacket {

    public PacketGetWolfBroGameDataScRsp(int id) {
        super(CmdId.GetWolfBroGameDataScRsp);

        var data = GetWolfBroGameDataScRsp.newInstance();

        data.setWolfBroGameData(WolfBroGameData.newInstance().setId(id).setJPJECFKEJIN("FSV_Wolf_01_Collider"));

        this.setData(data);
    }
}
