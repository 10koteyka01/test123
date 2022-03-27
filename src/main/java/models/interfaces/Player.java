package models.interfaces;

import models.implementations.Point;
import models.implementations.Vessel;

import java.util.List;

/**
 * Общий интерфейс для игроков
 */
public interface Player {
    /**
     * Метод для расстановки кораблей
     */
    void getReadyForGame();

    /**
     * Состояние готовности конкретного игрока к игре (расставил ли корабли?)
     */
    Boolean isReadyToPlay();

    /**
     * Получить список всех кораблей с координатами
     * @return
     */
    List<Vessel> getVessels();

    /**
     * Добавить судно
     * @param vessel
     */
    void addVessel(Vessel vessel);

    /**
     * Свободно ли поле для добавления палубы
     * @param point - координаты палубы
     */
    Boolean isPointEmptyForPoint(Point point);
}
