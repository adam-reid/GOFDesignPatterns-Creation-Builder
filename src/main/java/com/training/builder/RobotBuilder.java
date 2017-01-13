package com.training.builder;

/**
 * Created by adame on 1/13/2017.
 */
public interface RobotBuilder {
    void buildRobotHead();
    void buildRobotArms();
    void buildRobotTorso();
    void buildRobotLegs();
    void buildRobotCatchPhrase();
    void buildRobotAction();
    Robot getRobot();
}
