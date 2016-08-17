package com.tuto.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftsMod
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(BlocksMod.blockTest, 5), new Object[]{"##", "RR", '#', ItemsMod.itemTest, 'R', Items.STICK});
        GameRegistry.addSmelting(BlocksMod.blockTest, new ItemStack(ItemsMod.itemTest, 5), 1.5F);
    }
}