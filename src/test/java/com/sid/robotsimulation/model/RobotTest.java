package com.sid.robotsimulation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RobotTest {
    @Test
    public void shouldCreateRobotWithPosition(){
        Robot robot = new Robot(new Position(0,0));

        Assertions.assertEquals(new Position(0, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotUp(){
        Robot robot = new Robot(new Position(0,0));

        robot.move(Directions.UP, 1);

        Assertions.assertEquals(new Position(0, 1), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotDown(){
        Robot robot = new Robot(new Position(0,1));

        robot.move(Directions.DOWN, 1);

        Assertions.assertEquals(new Position(0, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotRight(){
        Robot robot = new Robot(new Position(1,0));

        robot.move(Directions.RIGHT, 1);

        Assertions.assertEquals(new Position(2, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotLeft(){
        Robot robot = new Robot(new Position(1,0));

        robot.move(Directions.LEFT, 1);

        Assertions.assertEquals(new Position(0, 0), robot.getCurrentPosition());
    }
}