package com.training.builder;

/**
 * Concrete class of the {@link RobotPlan}.
 */
public class Robot implements RobotPlan{

    private String robotHead;
    private String robotArms;
    private String robotTorso;
    private String robotLegs;
    private String robotCatchPhrase;
    private String robotAction;


    @Override
    public void setRobotHead(String head) {
        this.robotHead = head;
    }

    @Override
    public void setRobotArms(String arms) {
        this.robotArms = arms;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.robotTorso = torso;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.robotLegs = legs;
    }

    @Override
    public void setRobotCatchPhrase(String phrase) {
        this.robotCatchPhrase = phrase;
    }

    @Override
    public void setRobotAction(String action) {
        this.robotAction = action;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

    public String getRobotCatchPhrase() {
        return robotCatchPhrase;
    }

    public String getRobotAction() {
        return robotAction;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "robotHead='" + robotHead + '\'' +
                ", robotArms='" + robotArms + '\'' +
                ", robotTorso='" + robotTorso + '\'' +
                ", robotLegs='" + robotLegs + '\'' +
                ", robotCatchPhrase='" + robotCatchPhrase + '\'' +
                ", robotAction='" + robotAction + '\'' +
                '}';
    }
}

