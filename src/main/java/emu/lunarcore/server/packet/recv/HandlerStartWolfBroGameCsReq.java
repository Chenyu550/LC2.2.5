package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.StartWolfBroGameCsReqOuterClass.StartWolfBroGameCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketStartWolfBroGameScRsp;

@Opcodes(CmdId.StartWolfBroGameCsReq)
public class HandlerStartWolfBroGameCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = StartWolfBroGameCsReq.parseFrom(data);

        session.send(new PacketStartWolfBroGameScRsp(req.getId()));
    }

}
