package com.sid.robotsimulation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RobotTest {
    @Test
    public void shouldCreateRobotWithPosition(){
        Robot robot = new Robot(positionObject(0, 0));

        Assertions.assertEquals(positionObject(0, 0), robot.getCurrentPosition());
    }

    private static Position positionObject(int i, int i2) {
        return new Position(i, i2);
    }

    @Test
    public void shouldMoveTheRobotUp(){
        Robot robot = new Robot(positionObject(0, 0));

        robot.moveUp();

        Assertions.assertEquals(positionObject(0, 1), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotDown(){
        Robot robot = new Robot(positionObject(0, 1));

        robot.moveDown();

        Assertions.assertEquals(positionObject(0, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotRight(){
        Robot robot = new Robot(positionObject(1, 0));

        robot.moveRight();

        Assertions.assertEquals(positionObject(2, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotLeft(){
        Robot robot = new Robot(positionObject(1, 0));

        robot.moveLeft();

        Assertions.assertEquals(positionObject(0, 0), robot.getCurrentPosition());
    }
}