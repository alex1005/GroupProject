package com.groupproject.triangle;

import com.groupproject.Color;

public class WhiteTriangle extends AbstractTriangle {

    public WhiteTriangle(double lengthOne, double lengthTwo, double lengthThree) {
        super(lengthOne, lengthTwo, lengthThree, Color.WHITE);
        System.out.printf("WhiteTriangle: WhiteTriangle(%f, %f, %f, %s)%n", lengthOne, lengthTwo, lengthThree, Color.WHITE);
    }

    public WhiteTriangle() {
        super(Color.WHITE);
        System.out.printf("WhiteTriangle: WhiteTriangle(%s)%n", Color.WHITE);
    }

}
