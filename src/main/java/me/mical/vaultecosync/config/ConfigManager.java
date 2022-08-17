package me.mical.vaultecosync.config;

import me.mical.vaultecosync.VaultEcoSync;
import org.serverct.parrot.parrotx.api.ParrotXAPI;
import org.serverct.parrot.parrotx.config.PConfig;
import org.serverct.parrot.parrotx.data.autoload.annotations.PAutoload;
import org.serverct.parrot.parrotx.data.autoload.annotations.PAutoloadGroup;

/**
 * @author xiaomu
 * @since 2022/8/17 12:31
 */
@PAutoloadGroup
@PAutoloadGroup("Database")
public class ConfigManager extends PConfig {

    @PAutoload("DatabaseType")
    public static String DATABASE_TYPE;

    @PAutoload(group = "Database", value = "Host")
    public static String DATABASE_HOST;

    @PAutoload(group = "Database", value = "Name")
    public static String DATABASE_NAME;

    @PAutoload(group = "Database", value = "Port")
    public static int DATABASE_PORT;

    @PAutoload(group = "Database", value = "User")
    public static String DATABASE_USER;

    @PAutoload(group = "Database", value = "Password")
    public static String DATABASE_PASSWORD;

    private static ConfigManager instance;

    public ConfigManager() {
        super(ParrotXAPI.getPlugin(VaultEcoSync.class), "config", "主配置文件");
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }
}
