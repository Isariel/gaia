package net.isariel.gaia.spigot

import net.isariel.gaia.spigot.module.GaiaModule
import net.isariel.hermes.api.HermesAPI
import org.bukkit.plugin.java.JavaPlugin

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
class GaiaSpigotPlugin : JavaPlugin() {

    private lateinit var application: GaiaApplication

    override fun onDisable() {
        application.doDisable()
    }

    override fun onEnable() {
        val hermesAgent = HermesAPI.getAgent()

        application = hermesAgent.initializeApplication(GaiaApplication::class.java, GaiaModule(this))
        application.doEnable()
    }
}
