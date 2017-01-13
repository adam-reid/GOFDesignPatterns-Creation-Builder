package com.training.builder;

/**
 * Created by adame on 1/13/2017.
 */
public interface RobotPlan {
    void setRobotHead(String head);
    void setRobotArms(String arms);
    void setRobotTorso(String torso);
    void setRobotLegs(String legs);
    void setRobotCatchPhrase(String phrase);
    void setRobotAction(String action);
}
