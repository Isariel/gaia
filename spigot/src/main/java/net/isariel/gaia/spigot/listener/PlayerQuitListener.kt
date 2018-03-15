package net.isariel.gaia.spigot.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent
import javax.inject.Inject
import javax.inject.Named

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
class PlayerQuitListener @Inject
constructor(@param:Named("messagePrefix") private val messagePrefix: String) : Listener {

    @EventHandler
    fun handlePlayerQuit(event: PlayerQuitEvent) {
        event.quitMessage = "$messagePrefix${event.player.displayName} ist jetzt weg."
    }
}
