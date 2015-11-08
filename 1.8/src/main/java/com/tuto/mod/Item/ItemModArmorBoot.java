package com.tuto.mod.Item;

import com.tuto.mod.Reference;
import com.tuto.mod.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemModArmorBoot extends ItemArmor
{

    public ItemModArmorBoot(ArmorMaterial material, int armorType)
    {
        super(material, 0, armorType);
    }
    
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
        super.onArmorTick(world, player, stack);
        {
            player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 1, 2));
        }
    }
    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemMod.armorBootsMod1)
        {
            return Reference.MOD_ID + ":textures/models/armor/armorMod_layer_1.png";
        }
            return null;
    }

}
