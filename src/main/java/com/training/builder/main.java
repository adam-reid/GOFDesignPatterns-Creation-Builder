package com.training.builder;

import sun.security.x509.RDN;

/**
 * Created by adame on 1/13/2017.
 */
public class main {

    public static void testRobot(RobotBuilder blueprints) {
        RobotDirector robotDirector = new RobotDirector(blueprints);

        robotDirector.makeRobot();
        Robot robot = robotDirector.getRobot();

        System.out.println(robot.toString());
    }

    public static void main(String[] args) {
        testRobot(new OldRobotBuilder());
        testRobot(new NewRobotBuilder());
    }
}
