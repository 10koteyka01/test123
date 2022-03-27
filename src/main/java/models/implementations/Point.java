package models.implementations;

import models.enums.PointType;

import static java.lang.Math.abs;

/**
 * Точка на карте
 */
public class Point {
    private int x;
    private int y;

    private PointType pointType = PointType.EMPTY;

    public Point(int x, int y) {
        if (x >= 10 || y >= 10) throw new UnsupportedOperationException("Такой точки быть не может");
        this.x = x;
        this.y = y;
    }

    public Boolean isPointNearCurrent(Point point) {
        if (abs(point.getX() - x) == 1 || abs(point.getY() - y) == 1)
            return true;
        else
            return false;
    }

    public int[][] getPointsCoordinatesNearCurrent(Point point) {
        int[][] coordinates = new int[3][3];

        return coordinates;
    }

    public void setX(int x) {
        if (x >= 10) throw new UnsupportedOperationException("Такой точки быть не может");
        this.x = x;
    }

    public void setY(int y) {
        if (y >= 10) throw new UnsupportedOperationException("Такой точки быть не может");
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public PointType getPointType() {
        return pointType;
    }
}
