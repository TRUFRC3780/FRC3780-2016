package org.usfirst.frc.team3780.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3780.robot.*;
/**
 * @author Andrew Lee
 */
<<<<<<< HEAD:src/org/usfirst/frc/team3780/robot/commands/ScyllaLeftForward.java
public class ScyllaLeftForward extends Command {

    public ScyllaLeftForward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	try {
    		requires(Robot.scylla);
    	} catch(IllegalArgumentException e) {
    		// Do nothing
    	}
    
=======
public class DriveLowerArm extends Command {
	
	private double timePassed = 0.0;
	private int direction = 0;
	private Timer timer;
	
	private Joystick joystick = Robot.oi.getArmJoystick();
	
    public DriveLowerArm() {
    	requires(Robot.arm);
    	timer = new Timer();
    	timer.stop();
>>>>>>> 45f9663fbce14b8f1444a091ca5518c8d6d47748:src/org/usfirst/frc/team3780/robot/commands/DriveLowerArm.java
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.scylla.driveLeft(0.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
<<<<<<< HEAD:src/org/usfirst/frc/team3780/robot/commands/ScyllaLeftForward.java
    	Robot.scylla.driveLeft(1.0);
=======
        timer.stop();
        timePassed += timer.get()*direction;
        timer.reset();
        
    	double y = joystick.getY();
    	if(y > 0) { 
    		// Arm is going forward    		
    		Robot.arm.driveLower(1.0);
    		direction = 1;
    		
    	} else if(y < 0) {
    		// Arm is going backward
    		if(timePassed > 0) Robot.arm.driveLower(-1.0); // Only go backward if we have positive time
    		direction = -1;
    		
    	} else { // y == 0
    		// Stop the arm
    		Robot.arm.stopLower();
    		direction = 0;
    	}
        timer.start();
>>>>>>> 45f9663fbce14b8f1444a091ca5518c8d6d47748:src/org/usfirst/frc/team3780/robot/commands/DriveLowerArm.java
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
<<<<<<< HEAD:src/org/usfirst/frc/team3780/robot/commands/ScyllaLeftForward.java
    	Robot.scylla.driveLeft(0.0);
=======
    	Robot.arm.stopLower();
    	
>>>>>>> 45f9663fbce14b8f1444a091ca5518c8d6d47748:src/org/usfirst/frc/team3780/robot/commands/DriveLowerArm.java
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
    
    	
}
