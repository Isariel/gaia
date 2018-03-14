package net.isariel.gaia.spigot.listener

import net.isariel.gaia.spigot.greeting.GreetingManager
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

import javax.inject.Inject

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
class PlayerJoinListener @Inject
constructor(private val greetingManager: GreetingManager) : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        greetingManager.greetPlayer(event.player)
    }
}
