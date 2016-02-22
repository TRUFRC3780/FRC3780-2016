package org.usfirst.frc.team3780.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
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
    
    // Drive Train *These numbers are placeholders and are not final.*
    public static final int DRIVE_FRONT_LEFT = 1;
    public static final int DRIVE_REAR_LEFT = 1;
    public static final int DRIVE_FRONT_RIGHT = 1;
    public static final int DRIVE_REAR_RIGHT = 1;
    
    // Corral Talon port number --> placeholder
    public static final int CORRAL_TALON_ID = 1;
    
    // Arm Talon port numbers --> placeholder
    public static final int ARM_TALON_LOWER_ID = 1;
    public static final int ARM_TALON_UPPER_ID = 1;
    
    // Drive Joystick port --> placeholder
    public static final int DRIVE_JOYSTICK_ID = 1;
    
    // Compressor PCM # --> placeholder
    public static final int COMPRESSOR_PCM_ID = 1;
}
