package com.training.builder;

/**
 * Created by adame on 1/13/2017.
 */
public class RobotDirector {
    private RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public void makeRobot() {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotLegs();
        this.robotBuilder.buildRobotCatchPhrase();
        this.robotBuilder.buildRobotAction();
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }
}
