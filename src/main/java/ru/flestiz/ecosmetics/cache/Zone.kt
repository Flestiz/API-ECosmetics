package ru.flestiz.ecosmetics.cache

import org.bukkit.Location
import org.bukkit.block.Block
import ru.flestiz.ecosmetics.utils.MCNotInstalledException

open class Zone {
    companion object {
        @JvmStatic fun getZone(id: String): Zone = throw MCNotInstalledException()
    }

    open fun getSprayLoc(): Location = throw MCNotInstalledException()
    open fun isInZone(block: Block): Boolean = throw MCNotInstalledException()
    open fun isActive(): Boolean = throw MCNotInstalledException()
    open fun getId(): String = throw MCNotInstalledException()
    open fun getEnter(): Location = throw MCNotInstalledException()
    open fun getExit(): Location = throw MCNotInstalledException()
    open fun getNpc(): Location = throw MCNotInstalledException()
    open fun getBalloon(): Location = throw MCNotInstalledException()
    open fun getName(): String = throw MCNotInstalledException()
}