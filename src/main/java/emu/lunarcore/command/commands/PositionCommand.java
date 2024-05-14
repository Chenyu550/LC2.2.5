package emu.lunarcore.command.commands;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;

@Command(label = "position", aliases = {"pos"}, permission = "player.setlevel", requireTarget = true, desc = "/position. Get your current position.")
public class PositionCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        int PosX = args.getTarget().getPos().getX();
        int PosY = args.getTarget().getPos().getY();
        int PosZ = args.getTarget().getPos().getZ();
        args.sendMessage("Your Position - X: " + PosX + ", Y: " + PosY + ", Z: " + PosZ);
    }

}
