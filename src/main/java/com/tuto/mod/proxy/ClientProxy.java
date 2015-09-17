package com.tuto.mod.proxy;

import com.tuto.mod.Entity.EntityTuto;
import com.tuto.mod.Handlers.EntityHandler;
import com.tuto.mod.Models.ModelTuto;
import com.tuto.mod.Render.RenderTuto;
import com.tuto.mod.init.BlockMod;
import com.tuto.mod.init.ItemMod;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        ItemMod.registerRenders();
        BlockMod.registerRenders();
        
        //Entity Mob
        EntityHandler.RegisterMonster(EntityTuto.class, "Tuto");
        
        //EntityRendering
        RenderingRegistry.registerEntityRenderingHandler(EntityTuto.class, new RenderTuto(Minecraft.getMinecraft().getRenderManager(), new ModelTuto(), 0.5F));
    }
}
