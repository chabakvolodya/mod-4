package com.goit.module4;

/**
 * Created by Администратор on 19.12.2015.
 */
public class Runner {
    public static void main(String[] args) {

        Point p1 = new Point(2, 5);
        Point p2 = new Point(5, 7);

        System.out.println(DistanceUtils.distanceTwoPoint(p1, p2));

    }
}
