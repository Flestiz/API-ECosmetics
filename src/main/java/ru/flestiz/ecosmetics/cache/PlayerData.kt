package ru.flestiz.ecosmetics.cache

import org.bukkit.OfflinePlayer
import ru.flestiz.ecosmetics.api.Cosmetic
import ru.flestiz.ecosmetics.api.CosmeticType
import ru.flestiz.ecosmetics.cache.cosmetics.Hat
import ru.flestiz.ecosmetics.cache.cosmetics.WStick
import ru.flestiz.ecosmetics.utils.MCNotInstalledException
import java.util.UUID

open class PlayerData {
    companion object {
        @JvmStatic fun getPlayer(player: OfflinePlayer): PlayerData = throw MCNotInstalledException()
    }

    open fun getHat(): Hat = throw MCNotInstalledException()
    open fun getBag(): Cosmetic = throw MCNotInstalledException()
    open fun getWStick(): WStick = throw MCNotInstalledException()
    open fun getBalloon(): Cosmetic = throw MCNotInstalledException()
    open fun getSpray(): Cosmetic = throw MCNotInstalledException()
    open fun removeCosmetic(cosmeticId: String): Unit = throw MCNotInstalledException()
    open fun setCosmetic(cosmetic: Cosmetic): Unit = throw MCNotInstalledException()
    open fun getUniqueId(): UUID = throw MCNotInstalledException()
    open fun getOfflinePlayer(): OfflinePlayer = throw MCNotInstalledException()
    open fun getCosmetics(): MutableMap<String, Cosmetic> = throw MCNotInstalledException()
    open fun getCosmeticsPerm(): MutableList<Cosmetic> = throw MCNotInstalledException()
    open fun getCosmeticById(id: String): Cosmetic = throw MCNotInstalledException()
    open fun addCosmetic(cosmetic: Cosmetic): Unit = throw MCNotInstalledException()
    open fun removeEquip(id: String): Unit = throw MCNotInstalledException()
    open fun removeEquip(cosmeticType: CosmeticType): Unit = throw MCNotInstalledException()
    open fun getEquip(cosmeticType: CosmeticType): Cosmetic = throw MCNotInstalledException()
    open fun isZone(): Boolean = throw MCNotInstalledException()
    open fun isExitingZone(): Boolean = throw MCNotInstalledException()
    open fun getEquippedCount(): Int = throw MCNotInstalledException()
    open fun cosmeticsInUse(): MutableSet<Cosmetic> = throw MCNotInstalledException()
    open fun hideAllCosmetics(): Unit = throw MCNotInstalledException()
    open fun showAllCosmetics(): Unit = throw MCNotInstalledException()
}