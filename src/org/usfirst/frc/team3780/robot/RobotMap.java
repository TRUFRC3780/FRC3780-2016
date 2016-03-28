package org.usfirst.frc.team3780.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * @author Andrew Lee
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
    
    // Drive Train
    public static final int DRIVE_FRONT_LEFT  = 3;
    public static final int DRIVE_REAR_LEFT   = 5;
    public static final int DRIVE_FRONT_RIGHT = 1;
    public static final int DRIVE_REAR_RIGHT  = 2;
    
    // Scylla Talon numbers
    public static final int SCYLLA_TALON_RIGHT_ID = 0;
    public static final int SCYLLA_TALON_LEFT_ID  = 4;
    
    // Drive Joystick port
    public static final int LEFT_JOYSTICK_ID  = 1; // Telemachus
    public static final int RIGHT_JOYSTICK_ID = 0; // Odysseus
    
    // Scylla buttons
    public static final int SCYLLA_FORWARD_BUTTON_ID        = 3;
    public static final int SCYLLA_BACKWARD_BUTTON_ID       = 2;
    public static final int SCYLLA_LEFT_FORWARD_BUTTON_ID   = 1;
    public static final int SCYLLA_LEFT_BACKWARD_BUTTON_ID  = 1;
    public static final int SCYLLA_RIGHT_FORWARD_BUTTON_ID  = 1;
    public static final int SCYLLA_RIGHT_BACKWARD_BUTTON_ID = 1;
}
