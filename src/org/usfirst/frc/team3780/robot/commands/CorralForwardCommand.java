  
import org.usfirst.frc.team3780.robot.subsystems.*;
import edu.wpi.first.wpilibj.*;
/**
 * Write a description of class CorralForwardCommand here.
 * 
 * @author gregoryKaiser
 * 
 */
public class CorralForwardCommand extends Command
{
    private Corral corral;
    
    public CorralForwardCommand()
    {
        super();
        corral = Robot.corral;
    }
    
    protected void iniialize()
    {
       corral.stop();
    }
    
    protected void execute()
    {
        corral.driveForward(1.0);
    }
    
    protected boolean isFinished()
    {
        return false;
    }
    
    protected void end()
    {
        corral.stop();
    }
    
    protected void interrupted()
    {
        end();
    }
}
