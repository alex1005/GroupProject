package com.groupproject;

import com.groupproject.triangle.BlackTriangle;
import com.groupproject.triangle.Triangle;

public class BlackFactory implements BaseFactory {


    @Override
    public void createTriangle() {
        Triangle blackTriangle = new BlackTriangle();
        blackTriangle.draw();

    }

    @Override
    public void createTriangle(double lengthOne, double lengthTwo, double lengthThree) {
        Triangle blackTriangle = new BlackTriangle(lengthOne, lengthTwo, lengthThree);
        blackTriangle.draw();

    }

    @Override
    public void createCircle() {

    }
}
