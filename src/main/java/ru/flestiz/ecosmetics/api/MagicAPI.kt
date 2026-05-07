package ru.flestiz.ecosmetics.api

import org.bukkit.Color
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Entity
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import ru.flestiz.ecosmetics.utils.MCNotInstalledException
import java.util.UUID

object MagicAPI {
    @JvmStatic fun hasCosmetic(player: Player, cosmeticId: String): Boolean = throw MCNotInstalledException()
    @JvmStatic fun hasEquipCosmetic(entity: Entity, cosmeticId: String): Boolean = throw MCNotInstalledException()
    @JvmStatic fun hasEquipCosmetic(player: Player, cosmeticType: CosmeticType): Boolean = throw MCNotInstalledException()
    @JvmStatic fun EquipCosmetic(player: Player, cosmeticId: String, color: String?, force: Boolean): Unit = throw MCNotInstalledException()
    @JvmStatic fun EquipCosmetic(entity: Entity, cosmeticId: String, colorHex: String?): Unit = throw MCNotInstalledException()
    @JvmStatic fun EquipCosmetic(entity: Entity, cosmeticId: String, color: Color?): Unit = throw MCNotInstalledException()
    @JvmStatic fun UnEquipCosmetic(player: Player, cosmeticType: CosmeticType): Unit = throw MCNotInstalledException()
    @JvmStatic fun UnEquipCosmetic(entity: Entity, cosmeticType: CosmeticType): Unit = throw MCNotInstalledException()
    @JvmStatic fun RemoveEntityCosmetics(entityUniqueId: UUID): Unit = throw MCNotInstalledException()

    @JvmStatic
    @Deprecated("use Cosmetic.getItemStack() or Cosmetic.getItemColor() instead.")
    fun getCosmeticItem(id: String): ItemStack = throw MCNotInstalledException()

    @JvmStatic fun getCosmeticId(name: String, type: String): String? = throw MCNotInstalledException()
    @JvmStatic fun getEquipped(name: String, type: String): ItemStack? = throw MCNotInstalledException()
    @JvmStatic fun getEquipped(offlinePlayer: OfflinePlayer, cosmeticType: CosmeticType): ItemStack? = throw MCNotInstalledException()
    @JvmStatic fun getPlayerCosmeticsAvailable(player: Player, cosmeticType: CosmeticType): Int = throw MCNotInstalledException()
    @JvmStatic fun spray(player: Player): Boolean = throw MCNotInstalledException()
    @JvmStatic fun tintItem(item: ItemStack, colorHex: String?): Boolean = throw MCNotInstalledException()
    @JvmStatic fun getPlayerAllCosmeticsAvailable(player: Player): Int = throw MCNotInstalledException()
    @JvmStatic fun getServerCosmeticsAvailable(cosmeticType: CosmeticType): Int = throw MCNotInstalledException()
    @JvmStatic fun getServerAllCosmeticsAvailable(): Int = throw MCNotInstalledException()
    @JvmStatic fun getCosmetics(): MutableSet<Cosmetic> = throw MCNotInstalledException()
    @JvmStatic fun getCosmeticsByType(cosmeticType: CosmeticType): MutableSet<Cosmetic> = throw MCNotInstalledException()
    @JvmStatic fun getCosmeticsHideByType(cosmeticType: CosmeticType): MutableSet<Cosmetic> = throw MCNotInstalledException()
}