package com.mod.tuto.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister
{
    public static void mainRegsitry()
    {
        registerWorldGen(new WorldGenTuto(), 0);
    }
    
    public static void registerWorldGen(IWorldGenerator iGenerator, int probability)
    {
        GameRegistry.registerWorldGenerator(iGenerator, probability);
    }
}
