package com.tuto.mod.Structures;

import java.util.Random;

import com.tuto.mod.init.BlockMod;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class StructureTuto
{
    public boolean genrate(World world, Random random, BlockPos pos)
    {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        
        if(world.getBlockState(new BlockPos(x, y-1, z)) == Blocks.grass.getDefaultState() && world.isAirBlock(new BlockPos(x, y+7, z)))
        {
            world.setBlockState(new BlockPos(x, y, z), BlockMod.block3d.getDefaultState());
            world.setBlockState(new BlockPos(x, y+1, z), BlockMod.block3d.getDefaultState());
            world.setBlockState(new BlockPos(x, y+2, z), BlockMod.block3d.getDefaultState());
            world.setBlockState(new BlockPos(x, y+3, z), BlockMod.block3d.getDefaultState());
            world.setBlockState(new BlockPos(x, y+4, z), BlockMod.block3d.getDefaultState());
            world.setBlockState(new BlockPos(x, y+5, z), BlockMod.block3d.getDefaultState());
            world.setBlockState(new BlockPos(x, y+6, z), Blocks.diamond_block.getDefaultState());
            world.setBlockState(new BlockPos(x+1, y+6, z), BlockMod.block3d.getDefaultState());
            world.setBlockState(new BlockPos(x+2, y+6, z), BlockMod.block3d.getDefaultState());
            world.setBlockState(new BlockPos(x-1, y+6, z), BlockMod.block3d.getDefaultState());
            world.setBlockState(new BlockPos(x-2, y+6, z), BlockMod.block3d.getDefaultState());
            return true;
        }
        
        return false;
    }
}
