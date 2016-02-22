package org.usfirst.frc.team3780.robot.commands;

import org.usfirst.frc.team3780.robot.*;
import org.usfirst.frc.team3780.robot.subsystems.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.*;
/**
 * Write a description of class CorralForwardCommand here.
 * 
 * @author gregoryKaiser
 * 
 */
public class CorralForwardCommand extends Command
{
    private Corral corral;
    
    public CorralForwardCommand() {
        corral = Robot.corral;
    }
    
    protected void initialize()
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
