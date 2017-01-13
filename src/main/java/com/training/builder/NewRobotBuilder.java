package com.training.builder;

/**
 * Created by adame on 1/13/2017.
 */
public class NewRobotBuilder implements RobotBuilder {

    private Robot robot;

    public NewRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        this.robot.setRobotHead("LCD screen");
    }

    @Override
    public void buildRobotArms() {
        this.robot.setRobotArms("lasers!");
    }

    @Override
    public void buildRobotTorso() {
        this.robot.setRobotTorso("flux capacitor");
    }

    @Override
    public void buildRobotLegs() {
        this.robot.setRobotLegs("hoverboards");
    }

    @Override
    public void buildRobotCatchPhrase() {
        this.robot.setRobotCatchPhrase("I'm so 2008. You so 2000 and late.");
    }

    @Override
    public void buildRobotAction() {
        this.robot.setRobotAction("karate chop action!");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
