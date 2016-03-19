package com.mod.tuto.proxy;

import com.mod.tuto.entity.EntityTuto;
import com.mod.tuto.init.RenderMod;
import com.mod.tuto.models.ModelTuto;
import com.mod.tuto.renders.RenderTuto;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        RenderMod.init();
    }
}