package com.tuto.mod;

import com.tuto.mod.World.WorldRegisterTuto;
import com.tuto.mod.init.BlockMod;
import com.tuto.mod.init.ItemMod;
import com.tuto.mod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModTuto
{
     @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
     public static CommonProxy proxy;
     
     @Instance(Reference.MOD_ID)
     public static ModTuto instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemMod.init();
        ItemMod.register();
        BlockMod.init();
        BlockMod.register();
        WorldRegisterTuto.MainRegistry();
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