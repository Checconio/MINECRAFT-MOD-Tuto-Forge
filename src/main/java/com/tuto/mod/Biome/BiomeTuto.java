package com.tuto.mod.Biome;

import java.util.Random;

import com.tuto.mod.World.WorldGenTuto;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeTuto extends BiomeGenBase
{

    public BiomeTuto(int id)
    {
        super(id);
        this.topBlock = Blocks.stone.getDefaultState();
        this.fillerBlock = Blocks.diamond_block.getDefaultState();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 10, 3, 8));
        this.theBiomeDecorator.mushroomsPerChunk = 5;
        this.theBiomeDecorator.generateLakes = true;
        this.waterColorMultiplier = 0x00FF26;
    }
    
    public WorldGenerator getRandomWorldGenForTrees(Random random)
    {
        return (WorldGenerator) (random.nextInt(5) == 0 ? new WorldGenTrees(false, 4, 2, 2, false) : (random.nextInt(10) == 0 ? this.worldGeneratorBigTree : new WorldGenTrees(false, 4, 0, 0, false)));
    }
    
    public int getBiomeGrassColor()
    {
        return 0x00FF26;
    }
    
    public static void generate(Random random, int chunkX, int chunkZ, World world)
    {
        
    }
    
    public void decorate(World world, Random random, int posX, int posZ, int minY, int maxY, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if(random.nextInt(1000) == 0)
        {
            int defaultChunkSize = 16;
            int Xpos = posX + random.nextInt(defaultChunkSize) + 8;
            int Ypos = minY + random.nextInt(maxY - minY);
            int Zpos = posZ + random.nextInt(defaultChunkSize) + 10;
            
            BlockPos blockPos = new BlockPos(Xpos, Ypos, Zpos);
            super.decorate(world, random, blockPos);
            
            WorldGenTuto worldGenTuto = new WorldGenTuto();
            BiomeTuto.generate(random, posX, posZ, world);
        }
    }
}