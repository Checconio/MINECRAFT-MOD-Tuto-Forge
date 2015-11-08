package com.tuto.mod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandlerMod implements IFuelHandler
{

    @Override
    public int getBurnTime(ItemStack fuel)
    {
        if(fuel.getItem() == ItemMod.itemModBasic)
        {
            return 500;
        }
        
        else if(fuel.getItem().getItemFromBlock(BlockMod.blockModBasic) != null)
        {
            return 50000;
        }
        return 0;
    }
    
}
