package ru.flestiz.ecosmetics.api

import org.bukkit.Color
import org.bukkit.entity.LivingEntity
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import ru.flestiz.ecosmetics.utils.MCNotInstalledException

abstract class Cosmetic {
    companion object {
        @JvmStatic fun getCloneCosmetic(id: String): Cosmetic = throw MCNotInstalledException()
        @JvmStatic fun getCosmetic(id: String): Cosmetic = throw MCNotInstalledException()
    }

    open fun getName(): String = throw MCNotInstalledException()
    open fun getId(): String = throw MCNotInstalledException()
    open fun getModelData(): Int = throw MCNotInstalledException()
    open fun getItemStack(): ItemStack = throw MCNotInstalledException()
    open fun getCosmeticType(): CosmeticType = throw MCNotInstalledException()
    open fun isColored(): Boolean = throw MCNotInstalledException()
    open fun getColor(): Color = throw MCNotInstalledException()
    open fun setColor(color: Color): Unit = throw MCNotInstalledException()
    open fun getItemColor(): ItemStack = throw MCNotInstalledException()
    open fun getItemColor(player: Player): ItemStack = throw MCNotInstalledException()
    open fun getPermission(): String = throw MCNotInstalledException()
    open fun setDefaultColor(defaultColor: Boolean): Unit = throw MCNotInstalledException()
    open fun isDefaultColor(): Boolean = throw MCNotInstalledException()
    open fun isHideMenu(): Boolean = throw MCNotInstalledException()
    open fun isHideCosmetic(): Boolean = throw MCNotInstalledException()
    open fun setHideCosmetic(hideCosmetic: Boolean): Unit = throw MCNotInstalledException()
    open fun setLendEntity(lendEntity: LivingEntity): Unit = throw MCNotInstalledException()
    open fun getPlayer(): Player = throw MCNotInstalledException()
    open fun getLendEntity(): LivingEntity = throw MCNotInstalledException()

    abstract fun hide(player: Player)

    @Deprecated("Deprecated in previous Java versions")
    abstract fun show(player: Player)

    abstract fun spawn(player: Player)
    abstract fun despawn(player: Player)
}