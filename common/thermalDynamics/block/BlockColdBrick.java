package thermalDynamics.block;

import thermalDynamics.lib.refrences;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockColdBrick extends Block
{

    public BlockColdBrick(int id, Material par2Material)
    {
        super(id, par2Material);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setUnlocalizedName("ColdBrick");
        
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ireg)
    {
        this.blockIcon = ireg.registerIcon(refrences.MOD_ID + ":" + this.getUnlocalizedName2());
        
    }

}
