/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.commands.IntakeMoveMotor;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static WPI_VictorSPX intakeMotor = new WPI_VictorSPX(10);
  IntakeMoveMotor moveMotor = new IntakeMoveMotor();
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(moveMotor);

    
 

  }
  /**
 * @return the intakeMotor
 */
public WPI_VictorSPX getIntakeMotor() {
	return intakeMotor;
}


public void teleopInit(){
    JoystickButton intakeButton = new JoystickButton(Robot.flightStickTwo, 1);

    intakeButton.whileHeld(moveMotor);

  }
}
