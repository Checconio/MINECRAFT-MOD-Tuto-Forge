package com.tuto.mod.events;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropsBlock
{
    @SubscribeEvent
    public void BlockDestroyed(HarvestDropsEvent event)
    {
        Random random = new Random();
        if(event.state.getBlock() == Blocks.stone)
        {
            event.drops.clear();
            event.drops.add(new ItemStack(Items.diamond, 1));
            event.drops.add(new ItemStack(Blocks.obsidian, 5 - random.nextInt(7)));
        }
    }
}