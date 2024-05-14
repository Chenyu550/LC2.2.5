package emu.lunarcore.server.packet.send;

import emu.lunarcore.data.GameData;
import emu.lunarcore.data.excel.StageExcel;
import emu.lunarcore.game.battle.Battle;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.game.player.lineup.PlayerLineup;
import emu.lunarcore.proto.EnterFeverTimeActivityStageCsReqOuterClass.EnterFeverTimeActivityStageCsReq;
import emu.lunarcore.proto.EnterFeverTimeActivityStageScRspOuterClass.EnterFeverTimeActivityStageScRsp;
import emu.lunarcore.proto.FeverTimeAvatarOuterClass.FeverTimeAvatar;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CacheablePacket;
import emu.lunarcore.server.packet.CmdId;

@CacheablePacket
public class PacketEnterFeverTimeActivityStageScRsp extends BasePacket {

    public PacketEnterFeverTimeActivityStageScRsp(EnterFeverTimeActivityStageCsReq req, Player player) {
        super(CmdId.EnterFeverTimeActivityStageScRsp);

        int stageId = 4150000 + req.getId() * 10 + player.getWorldLevel();
        StageExcel stage = GameData.getStageExcelMap().get(stageId);

        var data = EnterFeverTimeActivityStageScRsp.newInstance()
            .setId(req.getId());

        PlayerLineup lineup = new PlayerLineup(player, 0);
        lineup.getAvatars().clear();

        for (FeverTimeAvatar avatar : req.getAvatarList()) {
            lineup.getAvatars().add(avatar.getId());
        }

        var battle = new Battle(player, lineup, stage);

        data.setBattleInfo(battle.toProto());

        this.setData(data);
    }
}
