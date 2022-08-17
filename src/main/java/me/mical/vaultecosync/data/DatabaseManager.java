package me.mical.vaultecosync.data;

import lombok.Getter;
import lombok.NonNull;
import me.mical.vaultecosync.config.ConfigManager;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.utils.i18n.I18n;

/**
 * @author xiaomu
 * @since 2022/8/17 12:56
 */
public class DatabaseManager {

    private final PPlugin plugin;
    private final I18n lang;

    @Getter
    private Database database;

    public DatabaseManager(@NonNull PPlugin plugin) {
        this.plugin = plugin;
        this.lang = plugin.getLang();
    }

    public void init() {
        switch (ConfigManager.DATABASE_TYPE.toUpperCase()) {
            case "YAML":
                // TODO
                break;
            case "SQLITE":
                // TODO
                break;
            case "MYSQL":
                // TODO
                break;
            default:
                lang.log.error(I18n.INIT, "数据库", "指定的数据库类型不存在");
                // TODO
                break;
        }
    }
}
