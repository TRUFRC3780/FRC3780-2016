  
import org.usfirst.frc.team3780.robot.subsystems.*;
import edu.wpi.first.wpilibj.*;
/**
 * Write a description of class CorralBackwardCommand here.
 * 
 * @author gregoryKaiser
 * 
 */
public class CorralBackwardCommand extends Command
{
    private Corral corral;
    
    public CorralBackwardCommand()
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
        corral.driveBackward(1.0);
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
