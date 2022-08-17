package me.mical.vaultecosync;

import lombok.Getter;
import me.mical.vaultecosync.config.ConfigManager;
import me.mical.vaultecosync.data.DatabaseManager;
import me.mical.vaultecosync.task.SyncTask;
import org.serverct.parrot.parrotx.PPlugin;

public final class VaultEcoSync extends PPlugin {

    @Getter
    private static DatabaseManager databaseManager;

    @Override
    protected void preload() {
        pConfig = new ConfigManager();
        setTimeLog("插件已启动, 耗时 &c{0} &fMs.");
    }

    @Override
    protected void load() {
        databaseManager = new DatabaseManager(this);
        databaseManager.init();
        new SyncTask(this).run();
    }
}
