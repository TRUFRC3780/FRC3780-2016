package org.usfirst.frc.team3780.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team3780.robot.RobotMap;

import edu.wpi.first.wpilibj.*;

/**
 *
 */
public class Arm extends Subsystem {

	private Talon lower, upper;
	
	public Arm() {
		lower = new Talon(RobotMap.ARM_TALON_LOWER_ID);
		upper = new Talon(RobotMap.ARM_TALON_UPPER_ID);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

