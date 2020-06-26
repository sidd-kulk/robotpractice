package com.sid.robotsimulation.model;

import static com.sid.robotsimulation.model.Directions.*;

public class Robot {
    private Position currentPosition;

    public Robot(Position startPosition) {
        this.currentPosition = startPosition;
    }

    public Position getCurrentPosition() {
        return this.currentPosition;
    }

    public void move(Directions direction, int steps) {
        Position currentPosition = this.currentPosition;
        int x = currentPosition.getXPosition();
        int y = currentPosition.getYPosition();

        this.currentPosition = calculateNewPosition(direction, x, y);
    }

    private Position calculateNewPosition(Directions direction, int x, int y) {
        Position newPosition = null;
        switch (direction) {
            case UP:
                newPosition = new Position(x, y + 1);
                break;
            case DOWN:
                newPosition = new Position(x, y - 1);
                break;
            case LEFT:
                newPosition = new Position(x - 1, y);
                break;
            case RIGHT:
                newPosition = new Position(x + 1, y);
                break;
        }
        return newPosition;
    }
}