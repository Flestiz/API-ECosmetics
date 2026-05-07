package ru.flestiz.ecosmetics.events

import org.bukkit.block.Block
import org.bukkit.entity.Player
import org.bukkit.event.Cancellable
import org.bukkit.event.HandlerList
import org.bukkit.event.player.PlayerEvent
import ru.flestiz.ecosmetics.api.SprayKeys
import ru.flestiz.ecosmetics.utils.MCNotInstalledException

class SprayDrawingEvent(
    player: Player,
    private val sprayedBlock: Block,
    private val key: SprayKeys
) : PlayerEvent(player), Cancellable {
    init { throw MCNotInstalledException() }

    companion object {
        @JvmStatic fun getHandlerList(): HandlerList = throw MCNotInstalledException()
    }

    override fun getHandlers(): HandlerList = throw MCNotInstalledException()
    override fun isCancelled(): Boolean = throw MCNotInstalledException()
    override fun setCancelled(cancel: Boolean): Unit = throw MCNotInstalledException()

    fun getKey(): SprayKeys = throw MCNotInstalledException()
    fun getSprayedBlock(): Block = throw MCNotInstalledException()
}