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
    public void shouldMoveTheRobotLeftNTimes(){
        Robot robot = new Robot(positionObject(1, 0));

        robot.moveCommand(Directions.LEFT, Directions.LEFT);

        Assertions.assertEquals(positionObject(-1, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotRightNTimes(){
        Robot robot = new Robot(positionObject(0, 0));

        robot.moveCommand(Directions.RIGHT, Directions.RIGHT, Directions.RIGHT);

        Assertions.assertEquals(positionObject(3, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotUpNTimes(){
        Robot robot = new Robot(positionObject(0, 0));

        robot.moveCommand(Directions.UP, Directions.UP, Directions.UP);

        Assertions.assertEquals(positionObject(0, 3), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotDownNTimes(){
        Robot robot = new Robot(positionObject(0, 0));

        robot.moveCommand(Directions.DOWN, Directions.DOWN, Directions.DOWN);

        Assertions.assertEquals(positionObject(0, -3), robot.getCurrentPosition());
    }
}