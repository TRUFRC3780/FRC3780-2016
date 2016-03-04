package org.usfirst.frc.team3780.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3780.robot.*;
import org.usfirst.frc.team3780.robot.commands.*;


/**
 * @author Andrew Lee
 */
public class Chassis extends Subsystem {
	
	private Talon frontLeft, frontRight, rearLeft, rearRight;
	private RobotDrive drive;
	
	public Chassis() {
		frontLeft  = new Talon(RobotMap.DRIVE_FRONT_LEFT);
		frontRight = new Talon(RobotMap.DRIVE_FRONT_RIGHT);
		rearLeft   = new Talon(RobotMap.DRIVE_REAR_LEFT);
		rearRight  = new Talon(RobotMap.DRIVE_REAR_RIGHT);
		
		drive = new RobotDrive(
			frontLeft,
			rearLeft,
			frontRight,
			rearRight
		);
	}
	
	public void arcadeDrive(Joystick j) {
		drive.arcadeDrive(j);
	}
    
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
	}
	
	public void driveForward(double speed) {
		drive.setLeftRightMotorOutputs(speed, speed);
	}
	
	public void stop() {
		drive.setLeftRightMotorOutputs(0, 0);
	}
	
	
}

