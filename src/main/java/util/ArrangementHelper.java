package util;

import models.implementations.Point;
import models.implementations.Vessel;

public class ArrangementHelper {
    public void checkPointForVessel(Vessel vessel, Point point) {
    }

    public static Boolean isPointValid(Vessel vessel, Point point) {
        //Проверка на то, что в судне ещё есть свободные палубы для добавления
        if (vessel.getAvailablePoints() <= 0) {
            System.out.println("Этому судну больше нельзя добавить палубу");
            return false;
        }

        //Проверка, что палуба первая, тогда можно ставить где угодно, если только это место не занято другим судном


        //Проверка, что палубу можно присоединить либо к концу судна
//        if (vessel.getVesselCoords())

        return false;
    }

    private boolean isPointSetNearLastPoint(Vessel vessel, Point point) {
        Point[] points = vessel.getVesselCoords();

        if (points[0] == null)
            return true;

        for (int i = 0; i < points.length; i++)
            if (points[i + 1] == null && points[i].isPointNearCurrent(point))
                return true;

        return false;
    }
}
