package com.sid.robotsimulation.model;

public class Robot
{
    private final Position currentPosition;
    public Robot(Position startPosition) {
        this.currentPosition = startPosition;
    }

    public Position getPosition() {
        return this.currentPosition;
    }
}