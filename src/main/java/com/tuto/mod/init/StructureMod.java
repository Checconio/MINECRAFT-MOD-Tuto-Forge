package com.tuto.mod.init;

import com.tuto.mod.World.WorldGenTuto;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class StructureMod
{
    public static void init()
    {
        WorldGenTuto structureGen = new WorldGenTuto();
        GameRegistry.registerWorldGenerator(structureGen, 0);
    }
}
