package net.isariel.gaia.spigot;

import net.isariel.gaia.spigot.listener.PlayerJoinListener;
import net.isariel.gaia.spigot.listener.PlayerQuitListener;
import net.isariel.hermes.api.app.HermesApplication;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class GaiaApplication extends HermesApplication {

    private final PluginManager pluginManager;
    private final Plugin plugin;

    private final PlayerJoinListener playerJoinListener;
    private final PlayerQuitListener playerQuitListener;

    @Inject
    public GaiaApplication(PluginManager pluginManager, @Named("gaiaPlugin") Plugin plugin,
                           PlayerJoinListener playerJoinListener, PlayerQuitListener playerQuitListener) {
        this.pluginManager = pluginManager;
        this.plugin = plugin;
        this.playerJoinListener = playerJoinListener;
        this.playerQuitListener = playerQuitListener;
    }

    @Override
    protected void doEnable() {
        pluginManager.registerEvents(playerJoinListener, plugin);
        pluginManager.registerEvents(playerQuitListener, plugin);
    }

    @Override
    protected void doDisable() {

    }
}
