package com.mod.tuto;

import com.mod.tuto.init.BlockMod;
import com.mod.tuto.init.EntityMod;
import com.mod.tuto.init.ItemMod;
import com.mod.tuto.proxy.CommonProxy;
import com.mod.tuto.world.WorldRegister;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModTuto
{
    @Instance(Reference.MOD_ID)
    public static ModTuto instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        BlockMod.init();
        BlockMod.register();
        ItemMod.init();
        ItemMod.register();
        WorldRegister.mainRegsitry();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
        EntityMod.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}