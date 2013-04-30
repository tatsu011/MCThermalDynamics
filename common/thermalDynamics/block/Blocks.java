package thermalDynamics.block;


import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import thermalDynamics.lib.*;

public class Blocks
{
    public static Block ColdBrick;
    
    public static void LoadBlocks()
    {
       
       ColdBrick = new BlockColdBrick(1500, Material.rock);
       
       GameRegistry.registerBlock(ColdBrick, refrences.MOD_ID + ColdBrick.getUnlocalizedName2());
       
       
       LanguageRegistry.addName(ColdBrick, "Cold Stone Brick");
    }

}
