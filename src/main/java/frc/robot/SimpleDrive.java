/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class SimpleDrive extends TimedRobot {
  private DifferentialDrive drive;
  private Joystick stick;

  @Override
  private void robotInit() {
    this.drive = new DifferentialDrive(
      new WPI_TalonSRX(0),
      new WPI_TalonSRX(1),
      new WPI_TalonSRX(2),
      new WPI_TalonSRX(3),
    );
    stick = new Joystick(0);

    this.init();
  }

  @Override
  private void teleopPeriodic() {
    this.loop();
  }

  public void init() {}
  public void loop() {}

  // Helper functions
  public double getX() {
    return stick.getRawAxis(0);
  }
  public double getY() {
    return stick.getRawAxis(1);
  }

  // Positive is right, negative is left
  public void drive(double power, double balance) {
    this.drive.tankDrive(power, balance);
  }
}
