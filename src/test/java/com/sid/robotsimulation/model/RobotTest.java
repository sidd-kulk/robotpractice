package com.sid.robotsimulation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RobotTest {
    @Test
    public void shouldCreateRobotObjectWithPosition(){
        Robot robot = new Robot(new Position(0,0));

        Assertions.assertEquals(robot.getPosition(), new Position(0, 0));
    }
}