package org.usfirst.frc.team3780.robot.commands;

import org.usfirst.frc.team3780.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * 
 * @author Andrew Lee
 * 
 */
public class UpperArmForwardCommand extends Command {

    public UpperArmForwardCommand() {
       requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.arm.stopUpper();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.arm.driveUpper(1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.arm.stopUpper();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
