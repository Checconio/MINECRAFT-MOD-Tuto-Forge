package com.mod.tuto.init;

import com.mod.tuto.Reference;
import com.mod.tuto.items.ItemArmorTuto;
import com.mod.tuto.items.ItemPickaxeTuto;
import com.mod.tuto.items.ItemSwordTuto;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMod
{
    public static ToolMaterial toolTuto = EnumHelper.addToolMaterial("toolTuto", 3, 1000, 10, 100, 30);
    public static ArmorMaterial armorTuto = EnumHelper.addArmorMaterial("armorTuto", 40, new int[]{8, 8, 8, 8}, 50);
    
    public static Item item_test, item_sword, item_pickaxe, casqueArmor, plastronArmor, pantalonArmor, bootArmor;
    
    public static void init()
    {
        item_test = new Item().setUnlocalizedName("item_test").setCreativeTab(CreativeTabs.tabDecorations).setTextureName(Reference.MOD_ID + ":item_test");
        item_sword = new ItemSwordTuto(ItemMod.toolTuto).setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":item_sword").setUnlocalizedName("item_sword");
        item_pickaxe = new ItemPickaxeTuto(ItemMod.toolTuto).setCreativeTab(CreativeTabs.tabTools).setTextureName(Reference.MOD_ID + ":item_pickaxe").setUnlocalizedName("item_pickaxe");
        casqueArmor = new ItemArmorTuto(armorTuto, 0).setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":casqueArmor").setUnlocalizedName("casqueArmor");
        plastronArmor = new ItemArmorTuto(armorTuto, 1).setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":plastronArmor").setUnlocalizedName("plastronArmor");
        pantalonArmor = new ItemArmorTuto(armorTuto, 2).setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":pantalonArmor").setUnlocalizedName("pantalonArmor");
        bootArmor = new ItemArmorTuto(armorTuto, 3).setCreativeTab(CreativeTabs.tabCombat).setTextureName(Reference.MOD_ID + ":bootArmor").setUnlocalizedName("bootArmor");
        
    }
    
    public static void register()
    {
        GameRegistry.registerItem(item_test, "item_test");
        GameRegistry.registerItem(item_sword, "item_sword");
        GameRegistry.registerItem(item_pickaxe, "item_pickaxe");
        GameRegistry.registerItem(casqueArmor, "casqueArmor");
        GameRegistry.registerItem(plastronArmor, "plastronArmor");
        GameRegistry.registerItem(pantalonArmor, "pantalonArmor");
        GameRegistry.registerItem(bootArmor, "bootArmor");
    }
}