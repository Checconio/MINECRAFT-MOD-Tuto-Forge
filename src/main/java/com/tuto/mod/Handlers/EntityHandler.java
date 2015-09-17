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
        int mainColor = 9983;
        int subColor = random.nextInt() * 16777215;
        
        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityRegistry.addSpawn(entityClass, 20, 1, 5, EnumCreatureType.MONSTER, BiomeGenBase.beach, BiomeGenBase.coldBeach, BiomeGenBase.desert);
        EntityRegistry.registerModEntity(entityClass, name, entityID, ModTuto.instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, mainColor, subColor));
    }
}
