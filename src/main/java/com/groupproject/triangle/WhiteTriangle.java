package com.groupproject.triangle;

import com.groupproject.Color;

public class WhiteTriangle extends Triangle {
    private final Color color = Color.WHITE;

    public WhiteTriangle(int a, int b, int c) throws Exception {
        super(a, b, c);
    }

    public WhiteTriangle() {
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
