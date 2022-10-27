package com.groupproject;

import com.groupproject.circle.Circle;
import com.groupproject.circle.WhiteCircle;
import com.groupproject.triangle.Triangle;
import com.groupproject.triangle.WhiteTriangle;


public class WhiteFactory implements BaseFactory {


    @Override
    public void createTriangle() {
        System.out.println("WhiteFactory: createTriangle()");
        Triangle whiteTriangle = new WhiteTriangle();
        whiteTriangle.draw();

    }

    @Override
    public void createTriangle(double lengthOne, double lengthTwo, double lengthThree) {
        System.out.printf("WhiteFactory: createTriangle(%f, %f, %f)%n", lengthOne, lengthTwo, lengthThree);
        Triangle whiteTriangle = new WhiteTriangle(lengthOne, lengthTwo, lengthThree);
        whiteTriangle.draw();

    }

    @Override
    public void createCircle() {
        System.out.println("WhiteFactory: createCircle()");
        Circle circle = new WhiteCircle();
        circle.draw();
    }

    @Override
    public void createCircle(double radius) {
        System.out.printf("WhiteFactory: createCircle(%f)%n", radius);
        Circle circle = new WhiteCircle(radius);
        circle.draw();
    }
}
