package net.isariel.gaia.spigot.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import net.isariel.gaia.spigot.GaiaSpigotPlugin;
import net.isariel.gaia.spigot.greeting.GreetingManager;
import net.isariel.gaia.spigot.greeting.GreetingManagerImpl;
import org.bukkit.plugin.Plugin;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class GaiaModule extends AbstractModule {

    private final GaiaSpigotPlugin gaiaSpigotPlugin;

    public GaiaModule(GaiaSpigotPlugin gaiaSpigotPlugin) {
        this.gaiaSpigotPlugin = gaiaSpigotPlugin;
    }

    @Override
    protected void configure() {
        bind(Plugin.class).annotatedWith(Names.named("gaiaPlugin")).toInstance(gaiaSpigotPlugin);

        bind(GreetingManager.class).to(GreetingManagerImpl.class).asEagerSingleton();
    }
}
