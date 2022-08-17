package me.mical.vaultecosync.command.impl;

import lombok.NonNull;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.command.BaseCommand;

/**
 * @author xiaomu
 * @since 2022/8/17 12:45
 */
public class SyncCommand extends BaseCommand {

    public SyncCommand(@NonNull PPlugin plugin) {
        super(plugin, "sync", 1);

        describe("同步玩家金钱数据.");
        perm(".sync");

        addParam(CommandParam.player(0, "要同步的玩家名, 不填则为在线的全体玩家.", args -> warn("玩家 &c{0} &f不在线或是不存在.", args[0])));
    }

    @Override
    protected void call(String[] args) {
        final Player target = convert(0, args, Player.class);
        if (target == null) {
            Bukkit.getOnlinePlayers().forEach(player -> {
                // TODO
            });
        } else {
            // TODO
        }
    }
}
