package org.usfirst.frc.team5243.robot.subsystems;

import org.usfirst.frc.team5243.robot.RobotMap;
import org.usfirst.frc.team5243.robot.commands.CubePSICommand;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CubePinSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Solenoid push;
	Compressor press;
	boolean enabled;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new CubePSICommand());
    }
    public CubePinSubsystem() {
    	push = new Solenoid(RobotMap.pcubesolenoidf, RobotMap.pcubesolendoidr);
    	press = new Compressor(RobotMap.cubecomp);
    	enabled = press.enabled();
    }
    public void toggleOn() {
    	if(RobotMap.pushOn) {
    		push.set(false);
    	}
    	else {
    		push.set(true);
    	}
    	RobotMap.pushOn = !RobotMap.pushOn;
    }
    public void pressureManage() {
    	press.setClosedLoopControl(true);
    }
}

