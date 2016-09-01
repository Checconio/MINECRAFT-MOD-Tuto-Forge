package com.tuto.mod.init;

import com.tuto.mod.ModTuto;
import com.tuto.mod.Reference;
import com.tuto.mod.Block.BlockCropsTuto;
import com.tuto.mod.Block.BlockFenceMod;
import com.tuto.mod.Block.BlockMulti;
import com.tuto.mod.Block.BlockStairsMod;
import com.tuto.mod.Block.BlocksMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockMod
{
    public static Block blockModBasic, blockStairsModBasic, blockFenceModBasic, block3d, cultureTuto, blockMulti1, blockMulti2, blockMulti3;
    
    public static void init()
    {
        /**Varriable*/
        Block block100 = (new BlocksMod(Material.rock));
        
        /**Block*/
        blockModBasic = new BlocksMod(Material.rock).setUnlocalizedName("blockModBasic").setCreativeTab(ModTuto.tabTuto);
        blockStairsModBasic = new BlockStairsMod(Blocks.obsidian.getDefaultState()).setUnlocalizedName("blockStairsModBasic").setResistance(1.0F);
        blockFenceModBasic = new BlockFenceMod(Material.rock).setUnlocalizedName("blockFenceModBasic");
        block3d = new BlocksMod(Material.glass).setUnlocalizedName("block3d").setCreativeTab(CreativeTabs.tabBlock);
        cultureTuto = new BlockCropsTuto().setUnlocalizedName("cultureTuto");
        blockMulti1 = new BlockMulti().setUnlocalizedName("blockMulti1").setCreativeTab(CreativeTabs.tabBlock);
        blockMulti2 = new BlockMulti().setUnlocalizedName("blockMulti2");
        blockMulti3 = new BlockMulti().setUnlocalizedName("blockMulti3");
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(blockModBasic, blockModBasic.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockStairsModBasic, blockStairsModBasic.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockFenceModBasic, blockFenceModBasic.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block3d, block3d.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(cultureTuto, cultureTuto.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockMulti1, blockMulti1.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockMulti2, blockMulti2.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockMulti3, blockMulti3.getUnlocalizedName().substring(5));
        
        /**Craft Block*/
        GameRegistry.addRecipe(new ItemStack(ItemMod.itemModBasic, 100), new Object[] {"#T#","   ", "TTT", '#', Blocks.sand, 'T', Items.apple});
        GameRegistry.addSmelting(ItemMod.itemModBasic, new ItemStack(BlockMod.blockModBasic, 58), 2.5F);
    }
    
    public static void registerRenders()
    {
        registerRender(blockModBasic);
        registerRender(blockStairsModBasic);
        registerRender(blockFenceModBasic);
        registerRender(block3d);
        registerRender(cultureTuto);
        registerRender(blockMulti1);
        registerRender(blockMulti2);
        registerRender(blockMulti3);
    }
    
    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}