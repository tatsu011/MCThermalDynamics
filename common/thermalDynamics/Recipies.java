package thermalDynamics;


import thermalDynamics.block.*;
import thermalDynamics.item.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;


public class Recipies
{
    public static void registerRecipies()
    {
        
        //shapeless Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(Items.SoftWire), new Object[]
                {new ItemStack(Items.Ulu), new ItemStack(Block.blockRedstone) });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ColdBrick), new Object[]
                {new ItemStack(Block.stoneBrick), new ItemStack(Item.snowball)});
        
        //shaped Recipes
        GameRegistry.addRecipe(new ItemStack(Items.Ulu), new Object[]
                {
                    "ABA",
                    " A ",
                    'A', Item.goldNugget, 
                    'B', Block.woodenButton
                });
        
        
    }
}
