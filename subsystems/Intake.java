/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.torontocodingcollective.subsystem.TSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.IntakeCom;

public class Intake extends TSubsystem {

/**
   * Creates a new Intake.
   */
  public static final WPI_VictorSPX intake = new WPI_VictorSPX(10);
  public static final Joystick flightStick = new Joystick(0);
  public IntakeCom   intakeC     = new IntakeCom();
  public Intake() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    



  }

    @Override
    public void init() {
        // TODO Auto-generated method stub

    }

    @Override
    public void updatePeriodic() {
        // TODO Auto-generated method stub

    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub
        setDefaultCommand(intakeC);

    }


}
