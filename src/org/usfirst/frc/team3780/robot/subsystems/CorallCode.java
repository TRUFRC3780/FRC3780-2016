package org.usfirst.frc.team3780.robot.subsystems;
import edu.wpi.first.wpilibj.SafePWM.Talon;
public class CorralSubsystem extends Subsystem
{
	private Talon t1;
	public CorralSubsystem()
	{
		t1 = new Talon();
	}
	public CorralSubsystem(int i)
	{
		t1 = new Talon(i);
	}
	public void stop()
	{
		t1.set(0);
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
}