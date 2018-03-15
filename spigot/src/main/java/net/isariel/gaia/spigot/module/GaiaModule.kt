package net.isariel.gaia.spigot.module

import com.google.inject.AbstractModule
import com.google.inject.name.Names
import net.isariel.gaia.spigot.GaiaSpigotPlugin
import net.isariel.gaia.spigot.greeting.GreetingManager
import net.isariel.gaia.spigot.greeting.GreetingManagerImpl
import org.bukkit.ChatColor
import org.bukkit.plugin.Plugin

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
class GaiaModule(private val gaiaSpigotPlugin: GaiaSpigotPlugin) : AbstractModule() {

    override fun configure() {
        bindConstant().annotatedWith(Names.named("messagePrefix")).to("${ChatColor.GRAY}[${ChatColor.RED}Isariel${ChatColor.GRAY}] ${ChatColor.GOLD}")
        bind<Plugin>(Plugin::class.java).annotatedWith(Names.named("gaiaPlugin")!!).toInstance(gaiaSpigotPlugin)
        bind<GreetingManager>(GreetingManager::class.java).to(GreetingManagerImpl::class.java).asEagerSingleton()
    }
}
