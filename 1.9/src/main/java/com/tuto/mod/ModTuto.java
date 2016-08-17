package com.tuto.mod;

import com.tuto.mod.init.BlocksMod;
import com.tuto.mod.init.CraftsMod;
import com.tuto.mod.init.ItemsMod;
import com.tuto.mod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.VERSION)

public class ModTuto
{
    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        BlocksMod.init();
        BlocksMod.register();
        ItemsMod.init();
        ItemsMod.register();
        CraftsMod.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}