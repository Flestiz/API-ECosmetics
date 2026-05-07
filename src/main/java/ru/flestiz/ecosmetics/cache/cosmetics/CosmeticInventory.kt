package ru.flestiz.ecosmetics.cache.cosmetics

import org.bukkit.inventory.ItemStack

interface CosmeticInventory {
    fun changeItem(originalItem: ItemStack): ItemStack
    fun leftItem()
    fun leftItemAndGet(): ItemStack
    fun getCurrentItemSaved(): ItemStack
}