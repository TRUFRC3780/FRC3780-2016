package org.usfirst.frc.team3780.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3780.robot.*;
import edu.wpi.first.wpilibj.*;
/**
 *
 */
public class ScyllaDrive extends Command {
	
	private Timer timer;
	
	// Min and max elapsed time values **PLACEHOLDERS**
	public static final double MINIMUM_TIME = -100.0;
	public static final double MAXIMUM_TIME = 100.0;
	
	// Net time spent going forward --> time spent going backward is counted as negative
	// Can be positive or negative
	private double elapsedTime;
	private Joystick joystick;
	private int direction;
	
    public ScyllaDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	try {
    		requires(Robot.scylla);
    	} catch(IllegalArgumentException e) {
    		// Do nothing
    	}
    	
    	// Init and stop timer
    	timer = new Timer();
    	timer.stop();
    	joystick = Robot.oi.getScyllaJoystick();
    	elapsedTime = 0.0;
    	direction = 0;
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.scylla.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	timer.stop();
    	double iterationTime = timer.get(); // How much time the robot spent in the previous iteration
    	
    	elapsedTime += (iterationTime * direction);
    	
    	timer.reset();
    	
    	double y = joystick.getY();
    	
    	
    	if(y < 0.0) {        // Forward
    		if(!(elapsedTime > MAXIMUM_TIME)) Robot.scylla.drive(1.0);
    		direction = 1;
    		
    		
    	} else if(y > 0.0) { // Backward
    		if(!(elapsedTime < MINIMUM_TIME)) Robot.scylla.drive(-1.0);
    		direction = -1;
    		
    	} else {           // Stop
    		Robot.scylla.stop();
    		direction = 0;
    	}
    	
    	
    	
    	timer.start();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.scylla.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
