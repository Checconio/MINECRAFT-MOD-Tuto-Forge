package com.tuto.mod.Item;

import com.tuto.mod.Reference;
import com.tuto.mod.init.ItemMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemModArmor extends ItemArmor
{

    public ItemModArmor(ArmorMaterial material, int armorType)
    {
        super(material,0 , armorType);
    }
    
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemMod.armorLeggingsMod1)
        {
            return Reference.MOD_ID + ":textures/models/armor/armorMod_layer_2.png";
        }
        
        else if (stack.getItem() == ItemMod.armorHelmetMod1 || stack.getItem() == ItemMod.armorChestplateMod1 || stack.getItem() == ItemMod.armorBootsMod1);
            return Reference.MOD_ID + ":textures/models/armor/armorMod_layer_1.png";
    }

}
