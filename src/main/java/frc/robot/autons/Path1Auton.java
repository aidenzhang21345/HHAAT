package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
//import frc.robot.commands.DriveTurn;
//import frc.robot.commands.DriveArc;
//import frc.robot.commands.DriveTime;
import frc.robot.commands.TurnDegrees;
//import frc.robot.commands.TurnTime;
import frc.robot.commands.DriveDistance;
import frc.robot.commands.DriveTurn;
//note the speed variable is supposed to be negative when reversing 
//note 90 turned about 120 instead of 90; a speed of 1 is insanely fast and too unrealistic to control
//bottom left or top right tony and henry
//turndegrees: positive number is counterclockwise/to the left; negative number is clockwise/to the right
public class Path1Auton extends SequentialCommandGroup {
    public Path1Auton(Drivetrain drivetrain) {
        addCommands( // assume the robot is facing out the exit of the base
            ///new DriveDistance(0.4, 18.0, drivetrain), // double speed, double inches, Drivetrain drive
            new TurnDegrees(-0.4, 75.0, drivetrain) // 1 double speed, double deg, double inches, Drivetrain drivetrain

           /*  new DriveDistance(0.4, 11.0, drivetrain),
            new TurnDegrees(0.4, 90.0, drivetrain), // 2

            new DriveDistance(0.4, 16.0, drivetrain),
            new TurnDegrees(0.4, 90.0, drivetrain), // 3

            new DriveDistance(0.4, 12.0, drivetrain),
            new TurnDegrees(0.4, -70, drivetrain), // 4

            new DriveDistance(0.4, 9.0, drivetrain) //5
            //add a comma if more commands
            //new -- continue function here if needed
            /* ROOKIES, INSERT DRIVE COMMANDS HERE TO CREATE YOUR AUTON! 
             * EX: new DriveTime(parameter, parameter, parameter)
            */

        );
        
    }
}


