package ThermalMain;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = "Tatsu011_ThermalDynamicse", name = "Thermal Dynamics", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class thermalDynamics 
{
	@SidedProxy(clientSide = "ThermalMain.clientProxy", serverSide = "ThermalMain.commonProxy")
	public static commonProxy proxy;
	
	
 @Init
 public void load(FMLInitializationEvent event) 
 {
	 proxy.registerRenderThings();
	 
	 
	 
	 
 }
}
