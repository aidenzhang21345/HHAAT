package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.DriveDistance;
import frc.robot.commands.DriveTurn;
//import frc.robot.commands.DriveArc;
//import frc.robot.commands.DriveTurn;
//import frc.robot.commands.DriveTime;
//import frc.robot.commands.TurnTime;
import frc.robot.commands.TurnDegrees;


// top left or bottom right
//After testing try to implement DriveTurn instead of TurnDegrees

public class Path2Auton extends SequentialCommandGroup { 
    public Path2Auton(Drivetrain drivetrain) {
        addCommands(
            //0N (START)
            new DriveDistance (0.4, 10.0, drivetrain), //1N
            new DriveTurn (0.5, -90.0,1,  drivetrain), //1E

            new DriveDistance (0.4, 12.0, drivetrain), //2E
            new DriveTurn (0.5, -90.0,1,  drivetrain), //2S

            new DriveDistance (0.4, 10.0, drivetrain), //3S
            new DriveTurn (0.5, 90.0,1,  drivetrain), //3E

            new DriveDistance(0.4, 15.0, drivetrain), //4E
            new DriveTurn (0.5, 90.0,1,  drivetrain), //4N

            new DriveDistance (0.4, 8.0, drivetrain), //5N
            new DriveTurn (0.5, 135.0,1,  drivetrain ), //5SE

            new DriveDistance (0.4, 16.0, drivetrain) //7SE (END)
            

            //* ROOKIES, INSERT DRIVE COMMANDS HERE TO CREATE YOUR AUTON! 
             //* EX: new DriveTime(parameter, parameter, parameter)
            
        );
    }
}
