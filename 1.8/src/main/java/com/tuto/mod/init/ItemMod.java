package com.tuto.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.tuto.mod.ModTuto;
import com.tuto.mod.Reference;
import com.tuto.mod.Item.ItemFoodTuto;
import com.tuto.mod.Item.ItemModArmor;
import com.tuto.mod.Item.ItemModArmorBoot;
import com.tuto.mod.Item.ItemModBasic;
import com.tuto.mod.Item.ItemModPickaxe;
import com.tuto.mod.Item.ItemModSword;
import com.tuto.mod.Item.ItemMultiTool;

public class ItemMod
{
    public static ToolMaterial toolMod = EnumHelper.addToolMaterial("toolMod", 2, 10000, 50.0F, 20, 50);
    public static ArmorMaterial armorMod = EnumHelper.addArmorMaterial("armorMod", "armorMod", 50, new int[]{3, 8, 6, 3}, 40);
    
    
    
    public static Item itemModBasic, pickaxeMod, swordMod, armorHelmetMod1, armorChestplateMod1, armorLeggingsMod1, armorBootsMod1, multiToolTuto, foodTuto, seedTuto;
    
    public static void init()
    {
        itemModBasic = new ItemModBasic().setUnlocalizedName("itemModBasic").setCreativeTab(CreativeTabs.tabDecorations);
        pickaxeMod = new ItemModPickaxe(toolMod).setUnlocalizedName("pickaxeMod").setCreativeTab(CreativeTabs.tabTools);
        swordMod = new ItemModSword(toolMod).setUnlocalizedName("swordMod").setCreativeTab(CreativeTabs.tabCombat);
        armorHelmetMod1 = new ItemModArmor(armorMod, 0).setUnlocalizedName("armorHelmetMod1");
        armorChestplateMod1 = new ItemModArmor(armorMod, 1).setUnlocalizedName("armorChestplateMod1");
        armorLeggingsMod1 = new ItemModArmor(armorMod, 2).setUnlocalizedName("armorLeggingsMod1");
        armorBootsMod1 = new ItemModArmorBoot(armorMod, 3).setUnlocalizedName("armorBootsMod1");
        multiToolTuto = new ItemMultiTool(toolMod).setUnlocalizedName("multiToolTuto").setCreativeTab(ModTuto.tabTuto);
        foodTuto = new ItemFoodTuto(4, 0.5F, true).setUnlocalizedName("foodTuto").setCreativeTab(ModTuto.tabTuto);
        seedTuto = new ItemSeeds(BlockMod.cultureTuto, Blocks.stone).setUnlocalizedName("seedTuto");
    }
    
    public static void register()
    {
        /**Item*/
        GameRegistry.registerItem(itemModBasic, "itemModBasic");
        GameRegistry.registerItem(pickaxeMod, "pickaxeMod");
        GameRegistry.registerItem(swordMod, "swordMod");
        GameRegistry.registerItem(armorHelmetMod1, "armorHelmetMod1");
        GameRegistry.registerItem(armorChestplateMod1, "armorChestplateMod1");
        GameRegistry.registerItem(armorLeggingsMod1, "armorLeggingsMod1");
        GameRegistry.registerItem(armorBootsMod1, "armorBootsMod1");
        GameRegistry.registerItem(multiToolTuto, "multiToolTuto");
        GameRegistry.registerItem(foodTuto, "foodTuto");
        GameRegistry.registerItem(seedTuto, "seedTuto");
        
        /**Craft Item*/
        GameRegistry.addRecipe(new ItemStack(ItemMod.itemModBasic, 10), new Object[] {"###", "# #", "###", '#', Items.apple});
        GameRegistry.addSmelting(Blocks.anvil, new ItemStack(Items.apple, 5), 100000000000000.0F);
    }
    
    public static void registerRenders()
    {
        registerRender(itemModBasic);
        registerRender(pickaxeMod);
        registerRender(swordMod);
        registerRender(armorHelmetMod1);
        registerRender(armorChestplateMod1);
        registerRender(armorLeggingsMod1);
        registerRender(armorBootsMod1);
        registerRender(multiToolTuto);
        registerRender(foodTuto);
        registerRender(seedTuto);
    }
    
    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}