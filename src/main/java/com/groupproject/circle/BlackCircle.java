package com.groupproject.circle;

import com.groupproject.Color;

public class BlackCircle extends AbstractCircle {

    public BlackCircle(double radius) {
        super(radius, Color.BLACK);
        System.out.printf("BlackCircle: BlackCircle(%f, %s)%n", radius, Color.BLACK);
    }
    public BlackCircle(){
        super(Color.BLACK);
        System.out.printf("BlackCircle: BlackCircle(%s)%n", Color.BLACK);
    }

}