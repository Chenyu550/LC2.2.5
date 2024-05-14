package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.MarkAvatarCsReqOuterClass;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketMarkAvatarScRsp;

@Opcodes(CmdId.MarkAvatarCsReq)
public class HandlerMarkAvatarCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = MarkAvatarCsReqOuterClass.MarkAvatarCsReq.parseFrom(data);
        
        session.getPlayer().markAvatar(req.getAvatarId(), req.getIsMarked());
        
        session.send(new PacketMarkAvatarScRsp(req.getAvatarId(), req.getIsMarked()));
    }
}
