package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.UpdateMovieRacingDataCsReqOuterClass.UpdateMovieRacingDataCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketUpdateMovieRacingDataScRsp;

@Opcodes(CmdId.UpdateMovieRacingDataCsReq)
public class HandlerUpdateMovieRacingDataCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = UpdateMovieRacingDataCsReq.parseFrom(data);

        session.send(new PacketUpdateMovieRacingDataScRsp(req));
    }

}
