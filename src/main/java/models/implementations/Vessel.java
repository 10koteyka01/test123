package models.implementations;

import static util.ArrangementHelper.isPointValid;

public class Vessel {
    private Point[] vesselCoords;
    private int pointsCount;

    public Vessel(int pointsCount) {
        this.pointsCount = pointsCount;
        vesselCoords = new Point[pointsCount];
    }

    /**
     * Добавить точку для судна, если судно рассчитано на такое количество точек
     * и точка находится рядом с остальными точками, на которых располагается судно.
     *
     * @param point - точка для добавления.
     */
    public void addPoint(Point point) {
        if (isPointValid(this, point)) {
            for (int i = 0; i < vesselCoords.length; i++) {
                if (vesselCoords[i] == null) {
                    vesselCoords[i] = point;
                    pointsCount--;
                }
            }
        } else {
            System.out.printf("В судно нельзя добавить палубу, с координатами {%d, %d}%n",
                    point.getX(),
                    point.getY());
        }
    }

    public int getAvailablePoints() {
        return pointsCount;
    }

    public Point[] getVesselCoords() {
        return vesselCoords;
    }
}
