package com.groupproject.circle;

import com.groupproject.Color;

public class WhiteCircle extends AbstractCircle {
    public WhiteCircle(double radius) {
        super(radius, Color.WHITE);
        System.out.printf("WhiteCircle: WhiteCircle(%f, %s)%n", radius, Color.WHITE);
    }
    public WhiteCircle() {
        super(Color.WHITE);
        System.out.printf("WhiteCircle: WhiteCircle(%s)%n", Color.WHITE);
    }


}