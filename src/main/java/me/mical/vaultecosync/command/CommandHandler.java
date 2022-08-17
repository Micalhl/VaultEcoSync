package me.mical.vaultecosync.command;

import me.mical.vaultecosync.VaultEcoSync;
import me.mical.vaultecosync.command.impl.SyncCommand;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.api.ParrotXAPI;
import org.serverct.parrot.parrotx.command.subcommands.DebugCommand;
import org.serverct.parrot.parrotx.command.subcommands.HelpCommand;
import org.serverct.parrot.parrotx.command.subcommands.ReloadCommand;
import org.serverct.parrot.parrotx.command.subcommands.VersionCommand;
import org.serverct.parrot.parrotx.data.autoload.annotations.PAutoload;

/**
 * @author xiaomu
 * @since 2022/8/17 12:42
 */
@PAutoload
public class CommandHandler extends org.serverct.parrot.parrotx.command.CommandHandler {

    public CommandHandler() {
        super(ParrotXAPI.getPlugin(VaultEcoSync.class), "vaultecosync");
        final PPlugin plugin = ParrotXAPI.getPlugin(VaultEcoSync.class);
        register(new HelpCommand(plugin));
        register(new ReloadCommand(plugin, ".reload"));
        register(new VersionCommand(plugin));
        register(new DebugCommand(plugin, ".debug"));
        register(new SyncCommand(plugin));
    }
}
