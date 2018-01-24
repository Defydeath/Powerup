package org.usfirst.frc.team5243.robot.subsystems;

import org.usfirst.frc.team5243.robot.RobotMap;
import org.usfirst.frc.team5243.robot.commands.ControlPSICommand;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class ClimbSubsystem extends Subsystem {
	Solenoid ds;
	Compressor c;
	//boolean pOn; //pressure On 
	boolean enabled;
	//boolean pressureSwitch;  -Checks if the pressure is low. May need this later 
    public void initDefaultCommand() {
    	setDefaultCommand(new ControlPSICommand());
    }
    public ClimbSubsystem() {
    	ds = new Solenoid(RobotMap.climbsolenoidf, RobotMap.climbsolenoidr);
    	enabled = c.enabled();
    	//pressureSwitch = c.getPressureSwitchValue(); //method for the boolean to check if the pressure is low
    	c = new Compressor(RobotMap.comp);
    }
    public void toggle() {
    	if(RobotMap.pOn) {
    		ds.set(false);
    	}
    	else {
    		ds.set(true);
    	}
    	RobotMap.pOn = !RobotMap.pOn;
    }
    public void controlPSI() {
    	c.setClosedLoopControl(true);
    }    
}

