package frc.robot.shooter;

import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSubsystem extends Subsystem {
    @Override
    public void initDefaultCommand() {
        this.setDefaultCommand(new ShootCommand());
    }
}