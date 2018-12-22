package frc.robot.drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Constants;

public class DriveSubsystem extends Subsystem {

    private final TalonSRX leftMaster = new TalonSRX(Constants.kLeftMasterId);
    private final TalonSRX leftSlave = new TalonSRX(Constants.kLeftSlaveId);
    private final TalonSRX rightMaster = new TalonSRX(Constants.kRightMasterId);
    private final TalonSRX rightSlave = new TalonSRX(Constants.kRightSlaveId);


    public DriveSubsystem() {
        leftSlave.follow(leftMaster);
        rightSlave.follow(rightMaster);

        rightMaster.setInverted(true);
        rightSlave.setInverted(true);
    }

    public void drive(double left, double right) {
        leftMaster.set(ControlMode.PercentOutput, left);
        rightMaster.set(ControlMode.PercentOutput, right);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }

}