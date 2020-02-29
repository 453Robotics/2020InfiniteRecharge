/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj.command.Command;


public class IntakeCom extends Command {
  /**
   * Creates a new IntakeCom.
   */
  public IntakeCom() {
    // Use addRequirements() here to declare subsystem dependencies.
    
  }


    // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() { 
    if(Intake.flightStick.getRawButton(1)){
        Intake.intake.set(.5);
      }
      else if(Intake.flightStick.getRawButton(2)){
        Intake.intake.set(-.25);
      }
      else{
        Intake.intake.set(0);
      } 
  }


  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
