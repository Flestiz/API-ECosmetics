package ru.flestiz.ecosmetics.cache.cosmetics

import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import ru.flestiz.ecosmetics.api.Cosmetic
import ru.flestiz.ecosmetics.utils.MCNotInstalledException

open class Hat : Cosmetic(), CosmeticInventory {
    open fun isOverlaps(): Boolean = throw MCNotInstalledException()
    open fun getOffSetY(): Double = throw MCNotInstalledException()
    override fun changeItem(originalItem: ItemStack): ItemStack = throw MCNotInstalledException()
    override fun leftItem(): Unit = throw MCNotInstalledException()
    override fun leftItemAndGet(): ItemStack = throw MCNotInstalledException()
    override fun getCurrentItemSaved(): ItemStack = throw MCNotInstalledException()
    override fun hide(player: Player): Unit = throw MCNotInstalledException()
    override fun show(player: Player): Unit = throw MCNotInstalledException()
    override fun spawn(player: Player): Unit = throw MCNotInstalledException()
    override fun despawn(player: Player): Unit = throw MCNotInstalledException()
}