package com.tuto.mod.Item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTimer extends Item
{
    private int timer = 0;
    private boolean onOff = false;
    
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        if(onOff == false)
        {
            playerIn.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 200, 0));
        }
        onOff = true;
        return itemStackIn;
    }
    
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
    {
        EntityPlayer player = (EntityPlayer) entityIn;
        if(onOff == true)
        {
            timer++;
        }
        
        if(timer == 200)
        {
            onOff = false;
            timer = 0;
        }
    }
}