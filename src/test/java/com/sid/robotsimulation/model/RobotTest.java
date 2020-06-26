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

        robot.moveUp();

        Assertions.assertEquals(new Position(0, 1), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotDown(){
        Robot robot = new Robot(new Position(0,1));

        robot.moveDown();

        Assertions.assertEquals(new Position(0, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotRight(){
        Robot robot = new Robot(new Position(1,0));

        robot.moveRight();

        Assertions.assertEquals(new Position(2, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotLeft(){
        Robot robot = new Robot(new Position(1,0));

        robot.moveLeft();

        Assertions.assertEquals(new Position(0, 0), robot.getCurrentPosition());
    }
}