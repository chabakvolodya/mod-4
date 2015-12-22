package com.goit.module4;

/**
 * Created by Администратор on 19.12.2015.
 */
public class DistanceUtils {
    private static int x1, y1, x2, y2;

    public static double distanceTwoPoint(Point p1, Point p2) {

        double result = Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p1.getY()));

        return result;
    }
}
