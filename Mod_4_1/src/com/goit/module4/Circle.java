package com.goit.module4;

/**
 * Created by Администратор on 19.12.2015.
 */
public class Circle extends Figure{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {

        area = (r * r) * Math.PI;
        return super.getArea();
    }

}
