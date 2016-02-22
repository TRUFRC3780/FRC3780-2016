package org.usfirst.frc.team3780.robot.subsystems;
import org.usfirst.frc.team3780.robot.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.*;

public class Corral extends Subsystem {
	
	
	private Talon t1;
	public Corral() {
		t1 = new Talon(RobotMap.CORRAL_TALON_ID);
	}
	
	public void stop()
	{
		t1.set(0.0);
	}
	public void driveForward(double i)
	{
		this.stop();
		t1.set(i);
	}
	public void driveBackward(double i)
	{
		this.stop();
		t1.set(-1*i);
	}
	
	public void initDefaultCommand() {
//		Uncomment to drive arm
//		setDefaultCommand(new DriveArm());
	}
}