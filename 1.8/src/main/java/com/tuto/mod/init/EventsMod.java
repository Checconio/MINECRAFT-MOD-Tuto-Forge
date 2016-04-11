package com.tuto.mod.init;

import com.tuto.mod.events.DropsBlock;

import net.minecraftforge.common.MinecraftForge;

public class EventsMod
{
    public static void init()
    {
        MinecraftForge.EVENT_BUS.register(new DropsBlock());
    }
}