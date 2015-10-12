package com.tuto.mod.init;

import com.tuto.mod.Biome.BiomeTuto;

import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomeMod
{
    public static void init()
    {
        BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(new BiomeTuto(100), 10));
    }
}
