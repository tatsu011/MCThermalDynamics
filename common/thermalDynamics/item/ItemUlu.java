package thermalDynamics.item;

import thermalDynamics.lib.refrences;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemUlu extends Item
{

    public ItemUlu(int par1)
    {
        super(par1);
        this.setCreativeTab(CreativeTabs.tabTools);
        
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ireg)
    {
        this.itemIcon = ireg.registerIcon(refrences.MOD_ID + ":" + this.getUnlocalizedName());
        
    }

}
