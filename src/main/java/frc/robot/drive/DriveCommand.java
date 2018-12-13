package frc.robot.drive;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveCommand extends Command {

    public DriveCommand() {
        requires(Robot.drive);
    }

    @Override
    protected void execute() {
        double left = -Robot.xbox.getY(Hand.kLeft);
        double right = -Robot.xbox.getY(Hand.kRight);

        Robot.drive.drive(left, right);
    }


    @Override
    protected boolean isFinished() {
        return false;
    }

}