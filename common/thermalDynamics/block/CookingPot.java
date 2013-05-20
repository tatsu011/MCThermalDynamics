package thermalDynamics.block;

import thermalDynamics.lib.refrences;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;

public class CookingPot extends Block
{

    public CookingPot(int par1, Material par2Material)
    {
        super(par1, par2Material);
        
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister IR)
    {
        this.blockIcon = IR.registerIcon(refrences.MOD_ID + ":" + this.getUnlocalizedName2());
    }
    
    @SideOnly(Side.CLIENT)
    public boolean hasTileEntity()
    {
        return true;
    }
    
    
  //This will tell minecraft not to render any side of our cube.
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
       return false;
    }

    //And this tell it that you can see through this block, and neighbor blocks should be rendered.
    public boolean isOpaqueCube()
    {
       return false;
    }

}
