package com.goit.module4;

/**
 * Created by Администратор on 19.12.2015.
 */
public class Runner {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(50.0, 30.0);
        Circle circle = new Circle(20.00);
        Rectangle rectangle = new Rectangle(20.15, 45.41);


        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(triangle.getArea());

    }
}
