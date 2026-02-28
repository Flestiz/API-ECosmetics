package ru.flestiz.ecosmetics.events;

import ru.flestiz.ecosmetics.api.Cosmetic;
import ru.flestiz.ecosmetics.cache.PlayerData;
import ru.flestiz.ecosmetics.utils.MCNotInstalledException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Set;

/**
 *  The event is called when the player's data has just been loaded.
 *  This event is asynchronous
 */
public class PlayerDataLoadEvent extends Event {

    public PlayerDataLoadEvent(PlayerData playerData, Set<Cosmetic> equippedCosmetics){
        super(true);
        throw new MCNotInstalledException();
    }

    @Override
    public HandlerList getHandlers() {
        throw  new MCNotInstalledException();
    }

    public static HandlerList getHandlerList() {
        throw  new MCNotInstalledException();
    }

    /**
     * Player whose data has been uploaded
     * @return PlayerData
     */
    public PlayerData getPlayerData() {
        throw  new MCNotInstalledException();
    }

    /**
     * Cosmetics that have been loaded and are now being equipped to the player.
     * @return cosmetics being used by the player
     */
    public Set<Cosmetic> getEquippedCosmetics() {
        throw  new MCNotInstalledException();
    }
}
