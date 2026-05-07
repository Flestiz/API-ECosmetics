package ru.flestiz.ecosmetics.events

import org.bukkit.entity.Player
import org.bukkit.event.Cancellable
import org.bukkit.event.HandlerList
import org.bukkit.event.player.PlayerEvent
import ru.flestiz.ecosmetics.api.Cosmetic
import ru.flestiz.ecosmetics.utils.MCNotInstalledException

class CosmeticChangeEquipEvent(
    player: Player,
    private val oldCosmetic: Cosmetic,
    private val newCosmetic: Cosmetic
) : PlayerEvent(player), Cancellable {
    init { throw MCNotInstalledException() }

    companion object {
        @JvmStatic fun getHandlerList(): HandlerList = throw MCNotInstalledException()
    }

    override fun getHandlers(): HandlerList = throw MCNotInstalledException()
    override fun isCancelled(): Boolean = throw MCNotInstalledException()
    override fun setCancelled(cancel: Boolean): Unit = throw MCNotInstalledException()

    fun getOldCosmetic(): Cosmetic = throw MCNotInstalledException()
    fun getNewCosmetic(): Cosmetic = throw MCNotInstalledException()
}