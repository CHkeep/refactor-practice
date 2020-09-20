package com.twu.refactoring;

public class Direction {
    public static final char NORTH = 'N';
    public static final char SOUTH = 'S';
    public static final char EAST = 'E';
    public static final char WEST = 'W';

    private final char direction;

    public Direction(char direction) {
        this.direction = direction;
    }

    public Direction turnRight() {
        switch (direction) {
            case NORTH:
                return new Direction('E');
            case SOUTH:
                return new Direction('W');
            case EAST:
                return new Direction('N');
            case WEST:
                return new Direction('S');
            default:
                throw new IllegalArgumentException();
        }
    }

    public Direction turnLeft() {
        switch (direction) {
            case WEST:
                return new Direction('W');
            case EAST:
                return new Direction('E');
            case SOUTH:
                return new Direction('N');
            case NORTH:
                return new Direction('S');
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction1 = (Direction) o;

        if (direction != direction1.direction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) direction;
    }

    @Override
    public String toString() {
        return "Direction{direction=" + direction + '}';
    }
}
