/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.subsystems.BallIntake;

public class BallOutputCommandGroup extends CommandGroup {

  public BallOutputCommandGroup(double I_speed , double H_speed) {
    
   addParallel(new BallIntakeCommand(I_speed));
   addParallel(new HopperCommand(H_speed));
   addParallel(new TailgateCommand());


  }


}