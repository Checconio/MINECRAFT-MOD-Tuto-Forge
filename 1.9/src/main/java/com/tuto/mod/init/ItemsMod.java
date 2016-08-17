package com.tuto.mod.init;

import com.tuto.mod.References;
import com.tuto.mod.items.ItemMod;
import com.tuto.mod.items.PickaxeMod;
import com.tuto.mod.items.SwordMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemsMod
{
    public static ToolMaterial TOOLTEST = EnumHelper.addToolMaterial("TOOLTEST", 1, 2000, 10.0F, 5.0F, 50);
    
    public static Item itemTest, pickaxeTuto, swordTuto;
    
    public static void init()
    {
        itemTest = new ItemMod().setUnlocalizedName("itemTest").setCreativeTab(CreativeTabs.DECORATIONS);
        pickaxeTuto = new PickaxeMod(TOOLTEST).setUnlocalizedName("pickaxeTuto").setCreativeTab(CreativeTabs.TOOLS);
        swordTuto = new SwordMod(TOOLTEST).setUnlocalizedName("swordTuto").setCreativeTab(CreativeTabs.COMBAT);
    }
    
    public static void register()
    {
        GameRegistry.registerItem(itemTest, itemTest.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(pickaxeTuto, pickaxeTuto.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(swordTuto, swordTuto.getUnlocalizedName().substring(5));
    }
    
    public static void registerRenders()
    {
        registerRender(itemTest);
        registerRender(pickaxeTuto);
        registerRender(swordTuto);
    }
    
    private static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}