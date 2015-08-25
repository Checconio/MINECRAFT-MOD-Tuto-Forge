package com.tuto.mod.proxy;

import com.tuto.mod.init.BlockMod;
import com.tuto.mod.init.ItemMod;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        ItemMod.registerRenders();
        BlockMod.registerRenders();
    }
}
