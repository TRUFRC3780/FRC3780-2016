package org.usfirst.frc.team3780.robot.commands;

import org.usfirst.frc.team3780.robot.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author Andrew Lee
 *
 */
public class DriveForwardForTime extends Command {

	private Timer timer;
	private double endTime;
	private double speed;
	
    public DriveForwardForTime(double seconds, double speed) {
    	try {
    		requires(Robot.chassis);
    	} catch(IllegalArgumentException e) {
    		
    	}
    	timer = new Timer();
    	endTime = seconds;
    	this.speed = speed;
    	
    	timer.stop();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.driveForward(speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.get() >= endTime;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
