package com.tuto.mod.items;

import com.tuto.mod.References;
import com.tuto.mod.init.ItemsMod;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorTuto extends ItemArmor
{
    public ItemArmorTuto(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, 0, equipmentSlotIn);
    }
    
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        if(this == ItemsMod.leggingsTuto)
        {
            return References.MOD_ID + ":textures/models/armor/armorTuto_layer_2.png";
        }
        
        else if (this == ItemsMod.helmetTuto || this == ItemsMod.chestplateTuto || this == ItemsMod.bootsTuto)
        {
            return References.MOD_ID + ":textures/models/armor/armorTuto_layer_1.png";
        }
        
        return null;
    }
}