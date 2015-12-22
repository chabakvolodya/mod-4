package com.goit.module4;

/**
 * Created by Администратор on 19.12.2015.
 */
public class Triangle extends Figure{

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {

        area = (a * h)/2;
        return super.getArea();
    }

}
