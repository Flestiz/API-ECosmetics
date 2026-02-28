package ru.flestiz.ecosmetics.events;

import ru.flestiz.ecosmetics.api.Cosmetic;
import ru.flestiz.ecosmetics.api.CosmeticType;
import ru.flestiz.ecosmetics.utils.MCNotInstalledException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Event called when player equip a cosmetic
 */
public class CosmeticEquipEvent extends PlayerEvent implements Cancellable {

    public CosmeticEquipEvent(Player player, Cosmetic cosmetic) {
        super(player);
        throw new MCNotInstalledException();
    }

    @Override
    public HandlerList getHandlers() {
        throw new MCNotInstalledException();
    }

    public static HandlerList getHandlerList() {
        throw new MCNotInstalledException();
    }

    public CosmeticType getCosmeticType() {
        throw new MCNotInstalledException();
    }

    @Override
    public boolean isCancelled() {
        throw new MCNotInstalledException();
    }

    @Override
    public void setCancelled(boolean cancel) {
        throw new MCNotInstalledException();
    }

    public Cosmetic getCosmetic() {
        throw new MCNotInstalledException();
    }

}
