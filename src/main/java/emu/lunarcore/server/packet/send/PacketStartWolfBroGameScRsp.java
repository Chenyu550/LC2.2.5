package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.StartWolfBroGameScRspOuterClass.StartWolfBroGameScRsp;
import emu.lunarcore.proto.WolfBroGameDataOuterClass.WolfBroGameData;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketStartWolfBroGameScRsp extends BasePacket {

    public PacketStartWolfBroGameScRsp(int id) {
        super(CmdId.StartWolfBroGameScRsp);

        var data = StartWolfBroGameScRsp.newInstance();

        data.setWolfBroGameData(WolfBroGameData.newInstance().setId(id).setJPJECFKEJIN("FSV_Wolf_01_Collider"));

        this.setData(data);
    }
}
