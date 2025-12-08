package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
//import frc.robot.commands.DriveTurn;
//import frc.robot.commands.DriveArc;
//import frc.robot.commands.DriveTime;
import frc.robot.commands.TurnDegrees;
//import frc.robot.commands.TurnTime;
import frc.robot.commands.DriveDistance;


//bottom left or top right tony and henry
//turndegrees: positive number is counterclockwise/to the left; negative number is clockwise/to the right
public class Path1Auton extends SequentialCommandGroup {
    public Path1Auton(Drivetrain drivetrain) {
        addCommands( // assume the robot is facing out the exit of the base
            new DriveDistance(1.0, 4.0, drivetrain), // double speed, double inches, Drivetrain drive
            new TurnDegrees(1.0, -90, drivetrain), // 1 double speed, double deg, double inches, Drivetrain drivetrain

            new DriveDistance(1.0, 1.0, drivetrain),
            new TurnDegrees(1.0, -90, drivetrain), // 2

            new DriveDistance(1.0, 1.0, drivetrain),
            new TurnDegrees(1.0, 90, drivetrain), // 3

            new DriveDistance(1.0, 1.0, drivetrain),
            new TurnDegrees(1.0, 90, drivetrain), // 4

            new DriveDistance(1.0, 1.0, drivetrain),
            new TurnDegrees(1.0, -90, drivetrain), // 5

            new DriveDistance(1.0, 1.0, drivetrain),
            new TurnDegrees(1.0, 1, drivetrain), // 6
            
            new DriveDistance(1.0, 1.0, drivetrain),
            new TurnDegrees(1.0, 90, drivetrain) //7 add a comma if more commands
            //new -- continue function here if needed
            /* ROOKIES, INSERT DRIVE COMMANDS HERE TO CREATE YOUR AUTON! 
             * EX: new DriveTime(parameter, parameter, parameter)
            */

        );
        
    }
}


