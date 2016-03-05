package org.usfirst.frc.team3780.robot;

import org.usfirst.frc.team3780.robot.commands.*;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * 
 * @author Andrew Lee
 * 
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
	
	Joystick leftJoystick = new Joystick(RobotMap.LEFT_JOYSTICK_ID);
	Joystick rightJoystick = new Joystick(RobotMap.RIGHT_JOYSTICK_ID);
	
	Button armForwardButton  = new JoystickButton(rightJoystick,RobotMap.UPPER_ARM_FORWARD_BUTTON_ID);
	Button armBackwardButton = new JoystickButton(rightJoystick,RobotMap.UPPER_ARM_BACKWARD_BUTTON_ID);
	
	public OI() {
		armForwardButton.whileHeld(new UpperArmForwardCommand());
		armBackwardButton.whileHeld(new UpperArmBackwardCommand());
	}
	
	public Joystick getDriveJoystick() {
		return leftJoystick;
	}
	
	public Joystick getArmJoystick() {
		return rightJoystick;
	}
	
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

