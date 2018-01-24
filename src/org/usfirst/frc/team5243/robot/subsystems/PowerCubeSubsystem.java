package org.usfirst.frc.team5243.robot.subsystems;

import org.usfirst.frc.team5243.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PowerCubeSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	DoubleSolenoid pshr; //pushing pneumatic 
	Compressor cmprsr; //compressor
	boolean enabled; //is it on? boolean for toggle
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    public PowerCubeSubsystem() {
    	enabled = cmprsr.enabled();
    	cmprsr = new Compressor(RobotMap.cubecomp);
    	pshr = new DoubleSolenoid(RobotMap.pcubesolenoidf, RobotMap.pcubesolendoidr);
    }
    public void toggleOn() {
    	pshr.set(RobotMap.pOn ? DoubleSolenoid.Value.kOff : DoubleSolenoid.Value.kForward);
    	RobotMap.pOn = !RobotMap.pOn;
    }
    public void controlPressure() {
    	cmprsr.setClosedLoopControl(true);
    }
    public void directionToggle() {
    	pshr.set(RobotMap.revTog ? DoubleSolenoid.Value.kForward : DoubleSolenoid.Value.kReverse);
    	RobotMap.revTog = !RobotMap.revTog;
    }
    
}

