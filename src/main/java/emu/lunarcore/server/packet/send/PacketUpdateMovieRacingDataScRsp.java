package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.UpdateMovieRacingDataCsReqOuterClass.UpdateMovieRacingDataCsReq;
import emu.lunarcore.proto.UpdateMovieRacingDataScRspOuterClass.UpdateMovieRacingDataScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketUpdateMovieRacingDataScRsp extends BasePacket {

    public PacketUpdateMovieRacingDataScRsp(UpdateMovieRacingDataCsReq req) {
        super(CmdId.UpdateMovieRacingDataScRsp);

        var data = UpdateMovieRacingDataScRsp.newInstance()
            .setRacingData(req.getMutableRacingData());

        this.setData(data);
    }
}
