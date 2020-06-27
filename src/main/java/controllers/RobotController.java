package controllers;

import com.sid.robotsimulation.model.Directions;
import com.sid.robotsimulation.model.Robot;

public class RobotController {

    private final Robot robot;

    public RobotController(Robot robot) {
        this.robot = robot;
    }

    public void robotMoveCommands(Directions ... directions) {
        robot.moveCommand(directions);
    }
}
