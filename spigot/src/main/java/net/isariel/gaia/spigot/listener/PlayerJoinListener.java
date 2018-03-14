package net.isariel.gaia.spigot.listener;

import net.isariel.gaia.spigot.greeting.GreetingManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import javax.inject.Inject;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class PlayerJoinListener implements Listener {

    private final GreetingManager greetingManager;

    @Inject
    public PlayerJoinListener(GreetingManager greetingManager) {
        this.greetingManager = greetingManager;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        greetingManager.greetPlayer(event.getPlayer());
    }
}
