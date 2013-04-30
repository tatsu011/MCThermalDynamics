package thermalDynamics.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items
{
    
    public static Item Ulu;
    public static Item SoftWire;
    
    public static void RegisterItems()
    {
        Ulu = new ItemUlu(5000).setUnlocalizedName("Ulu");
        SoftWire = new ItemSoftWire(5001).setUnlocalizedName("Soft Redstone Wire");
        
        LanguageRegistry.addName(SoftWire, "Soft Redstone Wire");
        LanguageRegistry.addName(Ulu, "Ulu");
        
    }
    
    
}
