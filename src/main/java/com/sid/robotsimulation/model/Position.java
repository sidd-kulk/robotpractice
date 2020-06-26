package com.sid.robotsimulation.model;

import java.util.Objects;

public class Position {

    public final int x;
    public final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position left() {
        return new Position(x-1, y);
    }

    public Position right() {
        return new Position(x+1, y);
    }

    public Position up() {
        return new Position(x, y+1);
    }

    public Position down() {
        return new Position(x, y-1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
