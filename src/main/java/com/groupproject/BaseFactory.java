package com.groupproject;

public interface BaseFactory {
    void createCircle();
    void createCircle(double radius);
    void createTriangle();
    void createTriangle(double lengthOne, double lengthTwo, double lengthThree);
}
