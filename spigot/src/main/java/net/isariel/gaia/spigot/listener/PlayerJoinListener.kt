package net.isariel.gaia.spigot.listener

import net.isariel.gaia.spigot.greeting.GreetingManager
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

import javax.inject.Inject
import javax.inject.Named

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
class PlayerJoinListener @Inject
constructor(private val greetingManager: GreetingManager, @param:Named("") private val messagePrefix: String) : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        greetingManager.greetPlayer(event.player)
        event.joinMessage = "$messagePrefix${event.player.displayName} ist jetzt hier."
    }
}
