package thermalDynamics.Logic;

import java.util.Random;

import net.minecraft.world.World;


//default LogicGate class
public class LogicGate
{
    int Signals[] = {0,0,0,0};

    public int getSignal(int Direction)
    {
       return Signals[Direction];
    }
    public int recieveSignal(int Direction, int Strength)
    {
        return 0;
    }
    
    public void UpdateTick(World par1World, int X, int Y, Random par5Random)
    {
        
    }
    
}
