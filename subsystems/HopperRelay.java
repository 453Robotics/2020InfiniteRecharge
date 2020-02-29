/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.torontocodingcollective.subsystem.TSubsystem;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import frc.robot.commands.RelayH;

public class HopperRelay extends TSubsystem {
  /**
   * Creates a new HopperRelay.
   */
  public static final Joystick flightStick = new Joystick(0);
  public static final int kRelayForwardButton = 3;
  public static final int kRelayBackwardButton= 4;
  public static final Relay m_relay = new Relay(0);
  public static final boolean forward = flightStick.getRawButton(kRelayForwardButton);
  public static final boolean backward = flightStick.getRawButton(kRelayBackwardButton);
  public static final RelayH hopRelay = new RelayH();
  public HopperRelay() {

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
        setDefaultCommand(hopRelay);
    }
}
