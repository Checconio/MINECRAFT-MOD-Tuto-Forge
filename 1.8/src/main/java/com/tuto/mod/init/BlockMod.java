package com.tuto.mod.init;

import com.tuto.mod.ModTuto;
import com.tuto.mod.Reference;
import com.tuto.mod.Block.BlockCropsMod;
import com.tuto.mod.Block.BlockFenceMod;
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
    public static Block blockModBasic, blockStairsModBasic, blockFenceModBasic, block3d, cultureTuto;
    
    public static void init()
    {
        /**Varriable*/
        Block block100 = (new BlocksMod(Material.rock));
        
        /**Block*/
        blockModBasic = new BlocksMod(Material.rock).setUnlocalizedName("blockModBasic").setCreativeTab(ModTuto.tabTuto);
        blockStairsModBasic = new BlockStairsMod(block100.getDefaultState()).setUnlocalizedName("blockStairsModBasic");
        blockFenceModBasic = new BlockFenceMod(Material.rock).setUnlocalizedName("blockFenceModBasic");
        block3d = new BlocksMod(Material.glass).setUnlocalizedName("block3d").setCreativeTab(CreativeTabs.tabBlock);
        cultureTuto = new BlockCropsMod().setUnlocalizedName("cultureTuto");
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(blockModBasic, blockModBasic.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockStairsModBasic, blockStairsModBasic.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockFenceModBasic, blockFenceModBasic.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(block3d, block3d.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(cultureTuto, cultureTuto.getUnlocalizedName().substring(5));
        
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
    }
    
    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}