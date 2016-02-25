package org.usfirst.frc.team3780.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3780.robot.RobotMap;
import org.usfirst.frc.team3780.robot.commands.*;
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
	
	public void stopLower() {
		lower.set(0.0);
	}
	
	public void stopUpper() {
		upper.set(0.0);
	}
	
	public void driveLower(double d) {
		stopLower();
		lower.set(d);
	}
	
	public void driveUpper(double d) {
		stopUpper();
		upper.set(d);
	}
	
    public void initDefaultCommand() {
        setDefaultCommand(new DriveLowerArm());
    }
}

