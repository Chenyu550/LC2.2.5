package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.GroupStateInfoOuterClass.GroupStateInfo;
import emu.lunarcore.proto.SceneEntityTeleportCsReqOuterClass.SceneEntityTeleportCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketGroupStateChangeScNotify;
import emu.lunarcore.server.packet.send.PacketGroupStateChangeScRsp;
import emu.lunarcore.server.packet.send.PacketSceneEntityTeleportScRsp;
import emu.lunarcore.server.packet.send.PacketUpdateFloorSavedValueNotify;

@Opcodes(CmdId.SceneEntityTeleportCsReq)
public class HandlerSceneEntityTeleportCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = SceneEntityTeleportCsReq.parseFrom(data);

        session.send(new PacketSceneEntityTeleportScRsp(req));

        var groupState = session.getPlayer().getScene().getGroupStates().get(session.getPlayer().getCurrentLeaderAvatar().getGroupId());
        var groupStateInfo = GroupStateInfo.newInstance();

        if (groupState == 1 || groupState == 0) {
            groupStateInfo.setGroupId(session.getPlayer().getCurrentLeaderAvatar().getGroupId())
                .setEntryId(req.getEntryId())
                .setGroupState(2)
                .setEMFPPBJCLGP(1);
            if (session.getPlayer().getScene().getGroupStates().containsKey(session.getPlayer().getCurrentLeaderAvatar().getGroupId())) {
                session.getPlayer().getScene().getGroupStates().replace(session.getPlayer().getCurrentLeaderAvatar().getGroupId(), 2);
            } else {
                session.getPlayer().getScene().getGroupStates().put(session.getPlayer().getCurrentLeaderAvatar().getGroupId(), 2);
            }
        } else {
            groupStateInfo
                .setGroupId(session.getPlayer().getCurrentLeaderAvatar().getGroupId())
                .setEntryId(req.getEntryId())
                .setGroupState(1)
                .setEMFPPBJCLGP(2);
            if (session.getPlayer().getScene().getGroupStates().containsKey(session.getPlayer().getCurrentLeaderAvatar().getGroupId())) {
                session.getPlayer().getScene().getGroupStates().replace(session.getPlayer().getCurrentLeaderAvatar().getGroupId(), 1);
            } else {
                session.getPlayer().getScene().getGroupStates().put(session.getPlayer().getCurrentLeaderAvatar().getGroupId(), 1);
            }
        }

        session.send(new PacketUpdateFloorSavedValueNotify(groupStateInfo));
        session.send(new PacketGroupStateChangeScNotify(groupStateInfo));
        session.send(new PacketGroupStateChangeScRsp(groupStateInfo));
    }

}
