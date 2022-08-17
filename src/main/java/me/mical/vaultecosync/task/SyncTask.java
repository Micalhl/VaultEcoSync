package me.mical.vaultecosync.task;

import lombok.NonNull;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import org.serverct.parrot.parrotx.PPlugin;

/**
 * @author xiaomu
 * @since 2022/8/17 13:15
 */
public class SyncTask {

    private final PPlugin plugin;

    public SyncTask(@NonNull PPlugin plugin) {
        this.plugin = plugin;
    }

    public void run() {
        new BukkitRunnable() {

            @Override
            public void run() {
                Bukkit.getOnlinePlayers().forEach(player -> {
                    // TODO: sync
                });
                plugin.getLang().log.info("已对服务器当前在线的全体玩家进行了金钱数据同步.");
            }
        }.runTaskTimerAsynchronously(plugin, 0L, 6000L);
    }
}
