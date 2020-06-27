package com.sid.robotsimulation.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    Position position = null;

    @BeforeEach
    private void initializePosition(){
        position = positonObject(1, 1);
    }

    private static Position positonObject(int i, int i2) {
        return new Position(i, i2);
    }

    @Test
    void moveLeft() {
        Position leftPosition = position.left();
        assertEquals(positonObject(0, 1), leftPosition);
    }

    @Test
    void moveRight() {
        Position rightPosition = position.right();
        assertEquals(positonObject(2, 1), rightPosition);
    }

    @Test
    void moveUp() {
        Position upPosition = position.up();
        assertEquals(positonObject(1, 2), upPosition);
    }

    @Test
    void moveDown() {
        Position downPosition = position.down();
        assertEquals(positonObject(1, 0), downPosition);
    }
}