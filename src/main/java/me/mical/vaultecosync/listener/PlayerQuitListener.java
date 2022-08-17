package me.mical.vaultecosync.listener;

import me.mical.vaultecosync.VaultEcoSync;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.api.ParrotXAPI;
import org.serverct.parrot.parrotx.data.autoload.annotations.PAutoload;

/**
 * @author xiaomu
 * @since 2022/8/17 13:14
 */
@PAutoload
public class PlayerQuitListener implements Listener {

    @EventHandler
    public void e(PlayerQuitEvent e) {
        final PPlugin plugin = ParrotXAPI.getPlugin(VaultEcoSync.class);
        // TODO: Sync save player data
        plugin.getLang().log.info("已完成对玩家 &c{0} &f金钱数据的保存.");
    }
}
