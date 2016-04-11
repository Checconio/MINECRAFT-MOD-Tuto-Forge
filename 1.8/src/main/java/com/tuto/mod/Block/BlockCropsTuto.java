package com.tuto.mod.Block;

import java.util.Random;

import com.tuto.mod.init.ItemMod;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockCropsTuto extends BlockCrops
{
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemMod.seedTuto;
    }
}
