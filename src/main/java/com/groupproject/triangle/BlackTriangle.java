package com.groupproject.triangle;

import com.groupproject.Color;

public class BlackTriangle extends Triangle {
    private final Color color = Color.BLACK;

    public BlackTriangle(int a, int b, int c) {
        super(a, b, c);
    }

    public BlackTriangle() {
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