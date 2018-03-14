package net.isariel.gaia.spigot.greeting;

import net.isariel.lycan.api.service.tablist.TablistService;
import org.bukkit.entity.Player;

import javax.inject.Inject;

/**
 * @author Felix Klauke <fklauke@itemis.de>
 */
public class GreetingManagerImpl implements GreetingManager {

    private final TablistService tablistService;

    @Inject
    public GreetingManagerImpl(TablistService tablistService) {
        this.tablistService = tablistService;
    }

    @Override
    public void greetPlayer(Player player) {
        tablistService.sendHeaderFooter(player, "\nWillkommen auf Isariel\n", "");
    }
}
