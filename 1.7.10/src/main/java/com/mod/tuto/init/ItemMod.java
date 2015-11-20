package com.mod.tuto.init;

import com.mod.tuto.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMod
{
    public static Item item_test;
    
    public static void init()
    {
        item_test = new Item().setUnlocalizedName("item_test").setCreativeTab(CreativeTabs.tabDecorations).setTextureName(Reference.MOD_ID + ":item_test");
    }
    
    public static void register()
    {
        GameRegistry.registerItem(item_test, "item_test");
    }
}