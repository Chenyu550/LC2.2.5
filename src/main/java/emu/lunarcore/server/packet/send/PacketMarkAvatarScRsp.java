package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.MarkAvatarScRspOuterClass;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketMarkAvatarScRsp extends BasePacket {

    public PacketMarkAvatarScRsp(int avatarId, boolean isMarked) {
        super(CmdId.MarkAvatarScRsp);

        var data = MarkAvatarScRspOuterClass.MarkAvatarScRsp.newInstance()
            .setAvatarId(avatarId)
            .setIsMarked(isMarked);

        this.setData(data);
    }
}
