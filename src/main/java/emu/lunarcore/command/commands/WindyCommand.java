package emu.lunarcore.command.commands;

import emu.lunarcore.LunarCore;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.server.packet.send.PacketClientDownloadDataScNotify;
import emu.lunarcore.util.Utils;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@Command(label = "windy", permission = "player.windy", requireTarget = true, desc = "/windy [name] - Windy!")
public class WindyCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Send windy packet
        var fullpath = Paths.get(".").toAbsolutePath().normalize().resolve("lua").resolve(args.getList().get(0));

        try {
            byte[] bytecode = Files.readAllBytes(fullpath);
            args.getSender().sendPacket(new PacketClientDownloadDataScNotify(bytecode, args.getSender()));
            args.sendMessage("Read BYTECODE from Lua script: " + fullpath);
        } catch (IOException e) {
            args.sendMessage("Error reading Lua script: " + e.getMessage());
        }
    }

}
