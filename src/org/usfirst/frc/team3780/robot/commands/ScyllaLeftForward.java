package org.usfirst.frc.team3780.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3780.robot.*;
/**
 * @author Andrew Lee
 */
public class ScyllaLeftForward extends Command {

    public ScyllaLeftForward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	try {
    		requires(Robot.scylla);
    	} catch(IllegalArgumentException e) {
    		// Do nothing
    	}
    
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.scylla.driveLeft(0.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.scylla.driveLeft(1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.scylla.driveLeft(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
