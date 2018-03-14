package net.isariel.gaia.spigot;

import net.isariel.gaia.spigot.module.GaiaModule;
import net.isariel.hermes.api.HermesAPI;
import net.isariel.hermes.api.HermesAgent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class GaiaSpigotPlugin extends JavaPlugin {

    private GaiaApplication application;

    @Override
    public void onDisable() {
        application.doDisable();
    }

    @Override
    public void onEnable() {
        HermesAgent hermesAgent = HermesAPI.getAgent();

        application = hermesAgent.initializeApplication(GaiaApplication.class, new GaiaModule(this));
        application.doEnable();
    }
}
