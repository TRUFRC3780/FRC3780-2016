package org.usfirst.frc.team3780.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team3780.robot.RobotMap;
import org.usfirst.frc.team3780.robot.commands.*;
import edu.wpi.first.wpilibj.*;

/**
 * @author Andrew Lee
 * 
 */
public class Scylla extends Subsystem {
    
	private Talon leftTalon ,rightTalon;
	
	public Scylla() {
		leftTalon  = new Talon(RobotMap.SCYLLA_TALON_LEFT_ID);
		rightTalon = new Talon(RobotMap.SCYLLA_TALON_RIGHT_ID);
	}
	
	public void drive(double d) {
		driveLeft(d);
		driveRight(d);
	}
	
	public void driveLeft(double d) {
		leftTalon.set(d);
	}
	
	public void driveRight(double d) {
		rightTalon.set(-1 * d);
	}
	
	public void stop() {
		leftTalon.set(0.0);
		rightTalon.set(0.0);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ScyllaDrive());
    }
}

