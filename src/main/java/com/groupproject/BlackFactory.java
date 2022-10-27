package com.groupproject;

import com.groupproject.circle.BlackCircle;
import com.groupproject.circle.Circle;
import com.groupproject.triangle.BlackTriangle;
import com.groupproject.triangle.Triangle;

public class BlackFactory implements BaseFactory {


    @Override
    public void createTriangle() {
        System.out.println("BlackFactory: createTriangle()");
        Triangle blackTriangle = new BlackTriangle();
        blackTriangle.draw();

    }

    @Override
    public void createTriangle(double lengthOne, double lengthTwo, double lengthThree) {
        System.out.printf("BlackFactory: createTriangle(%f, %f, %f)%n", lengthOne, lengthTwo, lengthThree);
        Triangle blackTriangle = new BlackTriangle(lengthOne, lengthTwo, lengthThree);
        blackTriangle.draw();
    }

    @Override
    public void createCircle() {
        System.out.println("BlackFactory: createCircle()");
        Circle circle = new BlackCircle();
        circle.draw();
    }

    @Override
    public void createCircle(double radius) {
        System.out.printf("BlackFactory: createCircle(%f)%n", radius);
        Circle circle = new BlackCircle(radius);
        circle.draw();
    }
}
