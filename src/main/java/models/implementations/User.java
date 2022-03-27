package models.implementations;

import models.enums.PointType;
import models.interfaces.Player;

import java.util.List;

import static models.enums.PointType.EMPTY;

public class User implements Player {
    Point[][] gameField = new Point[10][10];

    @Override
    public void getReadyForGame() {

    }

    @Override
    public Boolean isReadyToPlay() {
        return null;
    }

    @Override
    public List<Vessel> getVessels() {
        return null;
    }

    @Override
    public void addVessel(Vessel vessel) {

    }

    @Override
    public Boolean isPointEmptyForPoint(Point point) {
        return null;
    }

    private Boolean isPointEmpty(Point point) {
        return gameField[point.getX()][point.getY()].getPointType() == EMPTY;
    }

    private Boolean isPointsNearCurrentEmpty(Point point) {
        for (int i = point.getX() - 1; i < point.getX() + 1; i++){
            for (int j = point.getY() - 1; j < point.getY() + 1; j++){
                if (gameField[i][j].getPointType() != EMPTY)
                    return false;
            }
        }
        return null;
    }
}
