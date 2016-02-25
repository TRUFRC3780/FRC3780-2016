package org.usfirst.frc.team3780.robot.commands;

import org.usfirst.frc.team3780.robot.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author Andrew Lee
 *
 */
public class DriveLowerArm extends Command {
	
	private Joystick joystick = Robot.oi.getArmJoystick();
	
    public DriveLowerArm() {
    	requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm.stopLower();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double y = joystick.getY();
    	if(y > 0) {
    		Robot.arm.driveLower(1.0);
    	} else if(y < 0) {
    		Robot.arm.driveLower(-1.0);
    	} else { // y == 0
    		Robot.arm.stopLower();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.arm.stopLower();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
