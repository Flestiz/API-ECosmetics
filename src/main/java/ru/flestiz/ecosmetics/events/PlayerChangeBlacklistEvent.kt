package ru.flestiz.ecosmetics.events

import org.bukkit.entity.Player
import org.bukkit.event.HandlerList
import org.bukkit.event.player.PlayerEvent
import ru.flestiz.ecosmetics.utils.MCNotInstalledException

class PlayerChangeBlacklistEvent(
    player: Player,
    private val inWorldBlacklist: Boolean
) : PlayerEvent(player) {
    init { throw MCNotInstalledException() }

    companion object {
        @JvmStatic fun getHandlerList(): HandlerList = throw MCNotInstalledException()
    }

    override fun getHandlers(): HandlerList = throw MCNotInstalledException()
    fun isInWorldBlacklist(): Boolean = throw MCNotInstalledException()
}