package org.usfirst.frc.team5243.robot.subsystems;

import org.usfirst.frc.team5243.robot.RobotMap;
import org.usfirst.frc.team5243.robot.commands.TalonToggle;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ClimbSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	CANTalon t1;
	CANTalon t2;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new TalonToggle());
	}
    public ClimbSubsystem() {
    	t1 = new CANTalon(RobotMap.talon1);
    	t2 = new CANTalon(RobotMap.talon2);
    }
    public void lift() {
    	t1.set(.5);
    	t2.set(.5);
    }
    public void stop() {
    	t1.disable();
    	t2.disable();
    }
    public void start() {
    	t1.enable();
    	t2.enable();
    }
    public void lower() {
    	t1.set(-.5);
    	t2.set(-.5);
    }
}

