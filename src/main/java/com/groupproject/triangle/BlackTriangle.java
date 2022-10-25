package com.groupproject.triangle;

import com.groupproject.Color;

public class BlackTriangle extends Triangle {
    private final Color color = Color.BLACK;

    public BlackTriangle(int a, int b, int c) throws Exception {
        super(a, b, c);
    }

    public BlackTriangle() {
        super();
    }

    public Color getColor() {
        return color;
    }
    public void draw() {
        super.draw();
        System.out.println("color = " + color);
    }

}