package com.groupproject.triangle;

import com.groupproject.Color;

public class WhiteTriangle extends Triangle {
    private final Color color = Color.WHITE;

    public WhiteTriangle(int a, int b, int c) {
        super(a, b, c);
    }

    public WhiteTriangle() {
        super();
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println(this);
        System.out.println("\tcolor = " + this.getColor());
    }

}
