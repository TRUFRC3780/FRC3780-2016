package org.usfirst.frc.team3780.robot.commands;

import org.usfirst.frc.team3780.robot.*;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author Andrew Lee
 *
 */
public class DriveCommand extends Command {

    public DriveCommand() {
    	try {
    		requires(Robot.chassis);
    	}
    	catch(IllegalArgumentException e) {
    		
    	}
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.arcadeDrive(Robot.oi.getDriveJoystick().getY(), Robot.oi.getDriveJoystick().getX()*-1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
