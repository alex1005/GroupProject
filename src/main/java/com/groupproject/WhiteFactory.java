package com.groupproject;

import com.groupproject.triangle.Triangle;
import com.groupproject.triangle.WhiteTriangle;


public class WhiteFactory implements BaseFactory {


    @Override
    public void createTriangle() {
        Triangle whiteTriangle = new WhiteTriangle();
        whiteTriangle.draw();

    }

    @Override
    public void createTriangle(double lengthOne, double lengthTwo, double lengthThree) {
        Triangle whiteTriangle = new WhiteTriangle(lengthOne, lengthTwo, lengthThree);
        whiteTriangle.draw();

    }

    @Override
    public void createCircle() {

    }
}
