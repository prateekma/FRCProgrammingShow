/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.drive.AutoDriveCommand;
import frc.robot.drive.DriveSubsystem;
import frc.robot.shooter.ShooterSubsystem;

public class Robot extends TimedRobot {

    public static XboxController xbox = new XboxController(Constants.kXboxControllerPort);

    public static ShooterSubsystem shooter = new ShooterSubsystem();
    public static DriveSubsystem drive = new DriveSubsystem();
  
    @Override
    public void robotInit() {}

    @Override
    public void robotPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void disabledInit() {}

    @Override
    public void disabledPeriodic() {}

    @Override
    public void autonomousInit() {
        new AutoDriveCommand().start();
    }



    @Override
    public void autonomousPeriodic() {}

    @Override
    public void teleopInit() {}

    @Override
    public void teleopPeriodic() {}

    @Override
    public void testPeriodic() {}
}
