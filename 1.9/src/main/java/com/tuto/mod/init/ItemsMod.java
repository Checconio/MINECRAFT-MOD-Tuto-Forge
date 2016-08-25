package com.tuto.mod.init;

import com.tuto.mod.References;
import com.tuto.mod.items.ItemArmorTuto;
import com.tuto.mod.items.ItemMod;
import com.tuto.mod.items.PickaxeMod;
import com.tuto.mod.items.SwordMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemsMod
{
    public static ToolMaterial TOOLTEST = EnumHelper.addToolMaterial("TOOLTEST", 1, 2000, 10.0F, 5.0F, 50);
    public static ArmorMaterial ARMORTUTO = EnumHelper.addArmorMaterial("ARMORTUTO", "ARMORTUTO", 40, new int[]{5, 2, 6, 4}, 40, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    
    public static Item itemTest, pickaxeTuto, swordTuto, helmetTuto, chestplateTuto, leggingsTuto, bootsTuto;
    
    public static void init()
    {
        itemTest = new ItemMod().setUnlocalizedName("itemTest").setCreativeTab(CreativeTabs.DECORATIONS);
        pickaxeTuto = new PickaxeMod(TOOLTEST).setUnlocalizedName("pickaxeTuto").setCreativeTab(CreativeTabs.TOOLS);
        swordTuto = new SwordMod(TOOLTEST).setUnlocalizedName("swordTuto").setCreativeTab(CreativeTabs.COMBAT);
        helmetTuto = new ItemArmorTuto(ARMORTUTO, EntityEquipmentSlot.HEAD).setUnlocalizedName("helmetTuto").setCreativeTab(CreativeTabs.COMBAT);
        chestplateTuto = new ItemArmorTuto(ARMORTUTO, EntityEquipmentSlot.CHEST).setUnlocalizedName("chestplateTuto").setCreativeTab(CreativeTabs.COMBAT);
        leggingsTuto = new ItemArmorTuto(ARMORTUTO, EntityEquipmentSlot.LEGS).setUnlocalizedName("leggingsTuto").setCreativeTab(CreativeTabs.COMBAT);
        bootsTuto = new ItemArmorTuto(ARMORTUTO, EntityEquipmentSlot.FEET).setUnlocalizedName("bootsTuto").setCreativeTab(CreativeTabs.COMBAT);
    }
    
    public static void register()
    {
        GameRegistry.registerItem(itemTest, itemTest.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(pickaxeTuto, pickaxeTuto.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(swordTuto, swordTuto.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(helmetTuto, helmetTuto.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(chestplateTuto, chestplateTuto.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(leggingsTuto, leggingsTuto.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(bootsTuto, bootsTuto.getUnlocalizedName().substring(5));
    }
    
    public static void registerRenders()
    {
        registerRender(itemTest);
        registerRender(pickaxeTuto);
        registerRender(swordTuto);
        registerRender(helmetTuto);
        registerRender(chestplateTuto);
        registerRender(leggingsTuto);
        registerRender(bootsTuto);
    }
    
    private static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}