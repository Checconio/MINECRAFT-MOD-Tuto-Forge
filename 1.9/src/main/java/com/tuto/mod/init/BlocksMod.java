package com.tuto.mod.init;

import com.tuto.mod.References;
import com.tuto.mod.blocks.BlockMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlocksMod
{
    public static Block blockTest;
    
    public static void init()
    {
        blockTest = new BlockMod(Material.ROCK).setUnlocalizedName("blockTest").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(blockTest, blockTest.getUnlocalizedName().substring(5));
    }
    
    public static void registerRenders()
    {
        registerRender(blockTest);
    }
    
    private static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}