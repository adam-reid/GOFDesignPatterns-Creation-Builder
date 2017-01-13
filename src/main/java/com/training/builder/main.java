package com.training.builder;

/**
 * Created by adame on 1/13/2017.
 */
public class main {
    public static void main(String[] args) {
        RobotBuilder oldRobotPlans = new OldRobotBuilder();
        RobotDirector robotDirector = new RobotDirector(oldRobotPlans);

        robotDirector.makeRobot();
        Robot robot = robotDirector.getRobot();

        System.out.println(robot.toString());
    }
}
