/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Add your docs here.
 */
public class VisionCommands {

   /* private Drivetrain mDrivetrain;

    private double tv,tx,ty,ta,ledMode;
    private boolean m_ValidTarget = false;

    public VisionCommands(Drivetrain mDrivetrain){
        this.mDrivetrain = mDrivetrain;
    }


    public void getTarget(){

        /*final double drive = 0.2;
        this.tv = NetworkTableInstance.getDefault().getTable("Limelight").getEntry("tv").getDouble(0);
        NetworkTableInstance.getDefault().getTable("Limelight").getEntry("ledMode").setNumber(1);

        if(tv == 1){
            
                //No Targets
                mDrivetrain.tank(0,0);
                return;
        }

            NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
            NetworkTableEntry tx = table.getEntry("tx");
            NetworkTableEntry ty = table.getEntry("ty");
            NetworkTableEntry ta = table.getEntry("ta");

            //Target Spotted
            this.tx = NetworkTableInstance.getDefault().getTable("Limelight").getEntry("tx").getDouble(0);
            double x = tx.getDouble(0.0);
            double y = ty.getDouble(0.0);
            double area = ta.getDouble(0.0);

            if(x < 0){

                mDrivetrain.tank(0, drive);
                SmartDashboard.putNumber("LimelightX", x);
                SmartDashboard.putNumber("LimelightY", y);
                SmartDashboard.putNumber("LimelightArea", area);

            }else if(x > 0){
            
            mDrivetrain.tank(drive, 0);
            }
        */
        }
            
        //}




