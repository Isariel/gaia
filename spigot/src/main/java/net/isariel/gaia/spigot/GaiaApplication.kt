package net.isariel.gaia.spigot

import net.isariel.gaia.spigot.listener.PlayerJoinListener
import net.isariel.gaia.spigot.listener.PlayerQuitListener
import net.isariel.hermes.api.app.HermesApplication
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.PluginManager

import javax.inject.Inject
import javax.inject.Named

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
class GaiaApplication @Inject
constructor(private val pluginManager: PluginManager, @param:Named("gaiaPlugin") private val plugin: Plugin,
            private val playerJoinListener: PlayerJoinListener, private val playerQuitListener: PlayerQuitListener) : HermesApplication() {

    public override fun doEnable() {
        pluginManager.registerEvents(playerJoinListener, plugin)
        pluginManager.registerEvents(playerQuitListener, plugin)
    }

    public override fun doDisable() {

    }
}
