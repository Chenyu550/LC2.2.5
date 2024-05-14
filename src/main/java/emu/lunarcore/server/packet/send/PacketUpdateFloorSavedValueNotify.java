package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.GroupStateInfoOuterClass.GroupStateInfo;
import emu.lunarcore.proto.UpdateFloorSavedValueNotifyOuterClass.UpdateFloorSavedValueNotify.SavedValueEntry;
import emu.lunarcore.proto.UpdateFloorSavedValueNotifyOuterClass.UpdateFloorSavedValueNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketUpdateFloorSavedValueNotify extends BasePacket {

    public PacketUpdateFloorSavedValueNotify(GroupStateInfo groupStateInfo) {
        super(CmdId.UpdateFloorSavedValueNotify);

        var data = UpdateFloorSavedValueNotify.newInstance();

        if (groupStateInfo.getGroupState() == 2) {
            var value = SavedValueEntry.newInstance().setKey("FSV_Wolf_01_Collider").setValue(0);
            data.addSavedValue(value);
        } else if (groupStateInfo.getGroupState() == 1) {
            var value = SavedValueEntry.newInstance().setKey("FSV_Wolf_01_Collider").setValue(1);
            data.addSavedValue(value);
        }

        this.setData(data);
    }
}
