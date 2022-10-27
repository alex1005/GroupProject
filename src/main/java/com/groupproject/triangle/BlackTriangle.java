package com.groupproject.triangle;

import com.groupproject.Color;

public class BlackTriangle extends AbstractTriangle {

    public BlackTriangle(double lengthOne, double lengthTwo, double lengthThree) {
        super(lengthOne, lengthTwo, lengthThree, Color.BLACK);
        System.out.printf("BlackTriangle: BlackTriangle(%f, %f, %f, %s)%n", lengthOne, lengthTwo, lengthThree, Color.BLACK);
    }

    public BlackTriangle() {
        super(Color.BLACK);
        System.out.printf("BlackTriangle: BlackTriangle(%s)%n", Color.BLACK);
    }

}