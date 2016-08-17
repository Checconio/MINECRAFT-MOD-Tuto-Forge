package com.tuto.mod.proxy;

import com.tuto.mod.init.BlocksMod;
import com.tuto.mod.init.ItemsMod;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        BlocksMod.registerRenders();
        ItemsMod.registerRenders();
    }
}