package org.usfirst.frc.team3780.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3780.robot.*;

/**
 *
 */
public class ScyllaBackward extends Command {

    public ScyllaBackward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	try {
    		requires(Robot.scylla);
    	} catch (IllegalArgumentException e) {
    		
    	}
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.scylla.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.scylla.drive(-0.25);
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
