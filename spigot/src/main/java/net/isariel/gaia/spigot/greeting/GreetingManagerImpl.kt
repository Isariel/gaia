package net.isariel.gaia.spigot.greeting

import net.isariel.lycan.api.service.tablist.TablistService
import org.bukkit.entity.Player

import javax.inject.Inject

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
class GreetingManagerImpl @Inject
constructor(private val tablistService: TablistService) : GreetingManager {

    override fun greetPlayer(player: Player) {
        tablistService.sendHeaderFooter(player, "\nWillkommen auf Isariel\n", "")
    }
}
