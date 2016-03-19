package com.mod.tuto.init;

import com.mod.tuto.entity.EntityTuto;
import com.mod.tuto.entity.EntityTuto2;
import com.mod.tuto.handlers.EntityHandler;

public class EntityMod
{
    public static void init()
    {
        EntityHandler.registerMonster(EntityTuto.class, "MobTuto");
        EntityHandler.registerAmbiants(EntityTuto2.class, "MobTuto2");
    }
}