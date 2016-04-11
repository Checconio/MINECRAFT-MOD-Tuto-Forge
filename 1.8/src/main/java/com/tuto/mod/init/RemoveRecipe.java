package com.tuto.mod.init;

import java.util.List;
import java.util.Map;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;

public class RemoveRecipe
{
    public static void init()
    {
        removeCraft(new ItemStack(Items.bed));
        removeCraft(new ItemStack(Blocks.diamond_block));
    }
    
    public static void removeCraft(ItemStack stack)
    {
        List<IRecipe> recipeList = CraftingManager.getInstance().getRecipeList();
        for(int i = 0; i < recipeList.size(); i++)
        {
            ItemStack output = recipeList.get(i).getRecipeOutput();
            if(output != null && stack.getItem() == output.getItem() && stack.getItemDamage() == output.getItemDamage())
            {
                recipeList.remove(i);
            }
        }
    }
}