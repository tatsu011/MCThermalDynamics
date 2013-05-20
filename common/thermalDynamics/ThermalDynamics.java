package thermalDynamics;

import thermalDynamics.lib.*;
import thermalDynamics.block.Blocks;
import thermalDynamics.crafting.Recipies;
import thermalDynamics.item.Items;
import thermalDynamics.client.renderer.tileEntity.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;


@Mod( modid = refrences.MOD_ID, name = refrences.MOD_NAME , version = refrences.VERSION)
public class ThermalDynamics
{
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
       //registers the blocks and items
        Blocks.LoadBlocks();
        Items.RegisterItems();
    }
    
    @Init
    public void Load(FMLInitializationEvent event)
    {
        //Registers the Recipies
        Recipies.registerRecipies();
        
        //Registers the Tile entities
        TileEntities.RegisterTileEntities();
        
    }
    
    @PostInit
    public void PostInit(FMLPostInitializationEvent event)
    {
        
    }

}
