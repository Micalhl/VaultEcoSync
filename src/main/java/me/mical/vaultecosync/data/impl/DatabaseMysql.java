package me.mical.vaultecosync.data.impl;

import lombok.NonNull;
import me.mical.vaultecosync.config.ConfigManager;
import me.mical.vaultecosync.data.Database;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.utils.HikariCPUtil;
import org.serverct.parrot.parrotx.utils.i18n.I18n;

/**
 * @author xiaomu
 * @since 2022/8/17 13:10
 */
public class DatabaseMysql implements Database {

    private final PPlugin plugin;
    private final I18n lang;

    public DatabaseMysql(@NonNull PPlugin plugin) {
        this.plugin = plugin;
        this.lang = plugin.getLang();
    }

    @Override
    public void init() {
        HikariCPUtil.setSqlConnectionPool(
                plugin,
                ConfigManager.DATABASE_HOST,
                String.valueOf(ConfigManager.DATABASE_PORT),
                ConfigManager.DATABASE_NAME,
                ConfigManager.DATABASE_USER,
                ConfigManager.DATABASE_PASSWORD
        );
        // TODO
    }

    @Override
    public void insert() {

    }
}
