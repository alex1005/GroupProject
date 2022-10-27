package com.groupproject.circle;

import com.groupproject.Color;

public abstract class AbstractCircle implements Circle {
    protected double radius;
    protected final Color color;


    public AbstractCircle(Color color) {
        System.out.printf("AbstractCircle: AbstractCircle(%s)%n", color);
        radius = 1;
        this.color = color;
    }

    public AbstractCircle(double radius, Color color) {
        System.out.printf("AbstractCircle: AbstractCircle(%f, %s)%n", radius, color);
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        return "Circle:" +
                "\n\tradius= " + radius +
                "\n\tcolor = " + color;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}



