package com.groupproject.triangle;

import com.groupproject.Color;

public abstract class AbstractTriangle implements Triangle {
    protected double lengthOne;
    protected double lengthTwo;
    protected double lengthThree;
    protected final Color color;


    public AbstractTriangle(Color color) {
        System.out.printf("AbstractTriangle: AbstractTriangle(%s)%n", color);
        lengthOne = 1;
        lengthTwo = 1;
        lengthThree = 1;
        this.color = color;
    }

    public AbstractTriangle(double lengthOne, double lengthTwo, double lengthThree, Color color) {
        System.out.printf("AbstractTriangle: AbstractTriangle(%f, %f, %f, %s)%n", lengthOne, lengthTwo, lengthThree, color);
        boolean triInq = triangleInequality(lengthOne, lengthTwo, lengthThree);
        if (!triInq) {
            throw new IllegalArgumentException("Triangle Inequality");
        } else {
            this.lengthOne = lengthOne;
            this.lengthTwo = lengthTwo;
            this.lengthThree = lengthThree;
            this.color = color;

        }
    }

    public boolean triangleInequality(double a, double b, double c) {
        return (a < b + c && b < a + c && c < a + b);
    }

    public String toString() {
        return "Triangle:" +
                "\n\tside one length = " + lengthOne +
                "\n\tside two length = " + lengthTwo +
                "\n\tside three length = " + lengthThree +
                "\n\tcolor = " + color;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    public double getLengthOne() {
        return lengthOne;
    }

    public double getLengthTwo() {
        return lengthTwo;
    }

    public double getLengthThree() {
        return lengthThree;
    }

    public Color getColor() {
        return color;
    }


    public void setLengthOne(double lengthParam) {
        lengthOne = lengthParam;
    }

    public void setLengthTwo(double lengthParam) {
        lengthTwo = lengthParam;
    }

    public void setLengthThree(double lengthParam) {
        lengthThree = lengthParam;
    }

}



