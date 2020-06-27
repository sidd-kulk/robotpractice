package controllers;

import com.sid.robotsimulation.model.Directions;
import com.sid.robotsimulation.model.Position;
import com.sid.robotsimulation.model.Robot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;

import java.util.zip.DeflaterInputStream;

import static org.junit.jupiter.api.Assertions.*;

class RobotControllerTest {

    Robot robot = null;

    @BeforeEach
    void initializeRobot(){
        robot = new Robot(new Position(0,0));
    }

    @Test
    public void shouldControlRobotMovements(){
        RobotController robotController = new RobotController(robot);
        robotController.robotMoveCommands(Directions.UP, Directions.RIGHT);

        Assertions.assertEquals(new Position(1,1), robot.getCurrentPosition());
    }

}