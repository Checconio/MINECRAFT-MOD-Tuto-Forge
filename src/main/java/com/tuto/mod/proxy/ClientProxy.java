package com.tuto.mod.proxy;

import com.tuto.mod.Entity.EntityTuto;
import com.tuto.mod.Entity.EntityTutoP;
import com.tuto.mod.Handlers.EntityHandler;
import com.tuto.mod.Models.ModelTuto;
import com.tuto.mod.Models.ModelTutoP;
import com.tuto.mod.Render.RenderTuto;
import com.tuto.mod.Render.RenderTutoP;
import com.tuto.mod.init.BiomeMod;
import com.tuto.mod.init.BlockMod;
import com.tuto.mod.init.FuelHandlerMod;
import com.tuto.mod.init.ItemMod;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        ItemMod.registerRenders();
        BlockMod.registerRenders();
        BiomeMod.init();
        GameRegistry.registerFuelHandler(new FuelHandlerMod());
        
        //EntityRendering
        RenderingRegistry.registerEntityRenderingHandler(EntityTuto.class, new RenderTuto(Minecraft.getMinecraft().getRenderManager(), new ModelTuto(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTutoP.class, new RenderTutoP(Minecraft.getMinecraft().getRenderManager(), new ModelTutoP(), 0.5F));
    }
}
