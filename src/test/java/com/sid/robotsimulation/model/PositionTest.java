package com.sid.robotsimulation.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    Position position = null;

    @BeforeEach
    private void initializePosition(){
        position = new Position(1,1);
    }

    @Test
    void moveLeft() {
        Position leftPosition = position.left();
        assertEquals(new Position(0,1), leftPosition);
    }

    @Test
    void moveRight() {
        Position rightPosition = position.right();
        assertEquals(new Position(2,1), rightPosition);
    }

    @Test
    void moveUp() {
        Position upPosition = position.up();
        assertEquals(new Position(1,2), upPosition);
    }

    @Test
    void moveDown() {
        Position downPosition = position.down();
        assertEquals(new Position(1,0), downPosition);
    }
}