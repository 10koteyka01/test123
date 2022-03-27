package models.implementations;

import models.interfaces.Player;

import java.util.List;

public class Computer implements Player {
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
}
