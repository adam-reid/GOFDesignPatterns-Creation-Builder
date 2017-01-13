package com.training.builder;

/**
 * Created by adame on 1/13/2017.
 */
public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("TV head");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Chainsaw arms");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Trash can torso");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Tire legs");
    }

    @Override
    public void buildRobotCatchPhrase() {
        robot.setRobotCatchPhrase("Gee golly!");
    }

    @Override
    public void buildRobotAction() {
        robot.setRobotAction("wheelie head stand action!");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
