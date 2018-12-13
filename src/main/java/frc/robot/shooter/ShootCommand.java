package frc.robot.shooter;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ShootCommand extends Command {
    public ShootCommand() {
        requires(Robot.shooter);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
    }
}
