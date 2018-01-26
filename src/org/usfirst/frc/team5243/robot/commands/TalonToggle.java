package org.usfirst.frc.team5243.robot.commands;

import org.usfirst.frc.team5243.robot.subsystems.ClimbSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TalonToggle extends Command {
	ClimbSubsystem climbSubsystem;
	boolean on;

	public TalonToggle() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		climbSubsystem = new ClimbSubsystem();
		on = false;
		requires(climbSubsystem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (on)
			climbSubsystem.stop();
		else
			climbSubsystem.start();
		on = !on;
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
