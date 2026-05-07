package ru.flestiz.ecosmetics.events

import org.bukkit.event.Event
import org.bukkit.event.HandlerList
import ru.flestiz.ecosmetics.api.Cosmetic
import ru.flestiz.ecosmetics.cache.PlayerData
import ru.flestiz.ecosmetics.utils.MCNotInstalledException

class PlayerDataLoadEvent(
    private val playerData: PlayerData,
    private val equippedCosmetics: MutableSet<Cosmetic>
) : Event(true) {
    init { throw MCNotInstalledException() }

    companion object {
        @JvmStatic fun getHandlerList(): HandlerList = throw MCNotInstalledException()
    }

    override fun getHandlers(): HandlerList = throw MCNotInstalledException()
    fun getPlayerData(): PlayerData = throw MCNotInstalledException()
    fun getEquippedCosmetics(): MutableSet<Cosmetic> = throw MCNotInstalledException()
}