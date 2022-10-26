package com.groupproject.triangle;

import com.groupproject.Color;

public class BlackTriangle extends AbstractTriangle {

    public BlackTriangle(double lengthOne, double lengthTwo, double lengthThree) {
        super(lengthOne, lengthTwo, lengthThree, Color.BLACK);
    }

    public BlackTriangle() {
        super(Color.BLACK);
    }

}