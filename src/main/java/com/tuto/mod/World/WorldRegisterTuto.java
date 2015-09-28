package com.tuto.mod.World;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldRegisterTuto
{
    public static void MainRegistry()
    {
        registerWorldGen(new WorldGenTuto(), -1);
        registerWorldGen(new WorldGenTuto(), 0);
        registerWorldGen(new WorldGenTuto(), 1);
    }

    private static void registerWorldGen(IWorldGenerator iGenerator, int weightProbability)
    {
        GameRegistry.registerWorldGenerator(iGenerator, weightProbability);
    }
}
