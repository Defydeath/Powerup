/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5243.robot;

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
	public static final int frontLeft = 0;
	public static final int frontRight = 2;
	public static final int backLeft = 1;
	public static final int backRight = 3;
	//place holders for piston subsystem
	public static final int comp = 4;
	public static final int pistonsolenoidr = 5;
	public static final int pistonsolenoidf = 6;
	public static final int pushr = 7;
	//place holders for cube subsystem
	public static final int pcubesolenoidf = 8;
	public static final int pcubesolendoidr = 9;
	public static final int cubecomp = 10;
	//place holders for climb subsystem
	public static final int talon1 = 11;
	public static final int talon2 = 12;
	
	
	
	public static boolean pushOn = true; //pressure on toggle for cubpinsubsystem
	public static boolean dirTog = true; //Reverse toggle for cubpinsubsystem
	public static boolean pOn = true; //pressure on
	public static boolean revTog = true; //reverse toggle
	
}
