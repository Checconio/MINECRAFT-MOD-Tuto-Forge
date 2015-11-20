package com.mod.tuto.init;

import com.mod.tuto.Reference;
import com.mod.tuto.blocks.BlockBasic;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMod
{
    public static Block block_test;
    
    public static void init()
    {
        block_test = new BlockBasic(Material.rock).setBlockName("block_test").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(Reference.MOD_ID + ":block_test");
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(block_test, block_test.getUnlocalizedName().substring(5));
    }
}
