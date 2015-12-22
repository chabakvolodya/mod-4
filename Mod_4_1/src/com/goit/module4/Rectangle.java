package com.goit.module4;

/**
 * Created by Администратор on 19.12.2015.
 */
public class Rectangle extends Figure{

    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {

        area = a * b;
        return super.getArea();
    }
}
