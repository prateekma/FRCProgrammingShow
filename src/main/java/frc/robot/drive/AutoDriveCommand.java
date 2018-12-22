package frc.robot.drive;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;

public class AutoDriveCommand extends TimedCommand {
    public AutoDriveCommand() {
        super(5.0);
        requires(Robot.drive);
    }

    @Override
    protected void execute() {
        Robot.drive.drive(0.5, 0.5);
    }
}