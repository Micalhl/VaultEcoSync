package me.mical.vaultecosync;

import lombok.Getter;
import me.mical.vaultecosync.config.ConfigManager;
import me.mical.vaultecosync.data.DatabaseManager;
import me.mical.vaultecosync.task.SyncTask;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.hooks.VaultUtil;

public final class VaultEcoSync extends PPlugin {

    @Getter
    private static DatabaseManager databaseManager;

    @Getter
    private static VaultUtil vaultUtil;

    @Override
    protected void preload() {
        pConfig = ConfigManager.getInstance();
        setTimeLog("插件已启动, 耗时 &c{0} &fMs.");
        setVersionLog("本插件基于 &cParrotX&f, 版本: &c{0}&f.");
    }

    @Override
    protected void load() {
        vaultUtil = new VaultUtil(this, true);
        databaseManager = new DatabaseManager(this);
        databaseManager.init();
        new SyncTask(this).run();
    }
}
