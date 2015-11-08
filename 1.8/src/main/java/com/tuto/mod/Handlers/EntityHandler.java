package com.tuto.mod.Handlers;

import java.util.Random;

import com.tuto.mod.ModTuto;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityHandler
{
    public static void RegisterMonster(Class entityClass, String name)
    {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long x = name.hashCode();
        Random random = new Random(x);
        int mainColor = random.nextInt() * 16777215;
        int subColor = random.nextInt() * 16777215;
        
        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityRegistry.addSpawn(entityClass, 20, 1, 5, EnumCreatureType.MONSTER, BiomeGenBase.beach, BiomeGenBase.coldBeach, BiomeGenBase.desert);
        EntityRegistry.registerModEntity(entityClass, name, entityID, ModTuto.instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, mainColor, subColor));
    }
    
    public static void RegisterAnimals(Class entityClass, String name)
    {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long x = name.hashCode();
        Random random = new Random(x);
        int mainColor = random.nextInt() * 1677589;
        int subColor = random.nextInt() * 1677589;
        
        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityRegistry.addSpawn(entityClass, 10, 1, 5, EnumCreatureType.AMBIENT, BiomeGenBase.beach, BiomeGenBase.coldBeach, BiomeGenBase.desert, BiomeGenBase.birchForestHills);
        EntityRegistry.registerModEntity(entityClass, name, entityID, ModTuto.instance, 25, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, mainColor, subColor));
    }
}
