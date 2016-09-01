package com.tuto.mod.Block;

import java.util.Random;

import com.tuto.mod.init.BlockMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class BlockMulti extends Block
{
    public BlockMulti()
    {
        super(Material.rock);
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(BlockMod.blockMulti1);
    }
    
    public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side)
    {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        
        if(this == BlockMod.blockMulti1 && worldIn.isAirBlock(new BlockPos(x, y+1, z)) && worldIn.isAirBlock(new BlockPos(x, y+2, z)))
        {
            return true;
        }
        return false;
    }
    
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        
        if(this == BlockMod.blockMulti1)
        {
            worldIn.setBlockState(new BlockPos(x, y+1, z), BlockMod.blockMulti2.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+2, z), BlockMod.blockMulti3.getDefaultState());
        }
        
        return this.getStateFromMeta(meta);
    }
    
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state)
    {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        
        if(this == BlockMod.blockMulti1)
        {
            worldIn.destroyBlock(new BlockPos(x, y+1, z), false);
            worldIn.destroyBlock(new BlockPos(x, y+2, z), false);
        }
        
        if(this == BlockMod.blockMulti2)
        {
            worldIn.destroyBlock(new BlockPos(x, y-1, z), false);
            worldIn.destroyBlock(new BlockPos(x, y+1, z), false);
        }
        
        if(this == BlockMod.blockMulti3)
        {
            worldIn.destroyBlock(new BlockPos(x, y-1, z), false);
            worldIn.destroyBlock(new BlockPos(x, y-2, z), false);
        }
    }
}
