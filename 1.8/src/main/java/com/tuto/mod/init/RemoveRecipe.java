package com.tuto.mod.init;

import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RemoveRecipe
{
    public static void init()
    {
        removeRecipe(new ItemStack(Items.bed));
        removeRecipe(new ItemStack(Blocks.diamond_block));
    }
    
    public static void removeRecipe(ItemStack stack)
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