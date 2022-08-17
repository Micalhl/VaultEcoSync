package me.mical.vaultecosync;

import me.mical.vaultecosync.config.ConfigManager;
import org.serverct.parrot.parrotx.PPlugin;

public final class VaultEcoSync extends PPlugin {

    @Override
    protected void preload() {
        pConfig = new ConfigManager();
    }
}
