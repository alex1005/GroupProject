package com.groupproject;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Creating factories:");
        BaseFactory baseFactoryBlack = AbstractFactory.getFactory(Color.BLACK);
        BaseFactory baseFactoryWhite = AbstractFactory.getFactory(Color.WHITE);
        System.out.println();
        System.out.println();

        System.out.println("Creating default triangles:");
        baseFactoryBlack.createTriangle();
        System.out.println();
        baseFactoryWhite.createTriangle();
        System.out.println();
        System.out.println();

        System.out.println("Creating triangles with parameters:");
        baseFactoryBlack.createTriangle(1.2, 1.2, 1.2);
        System.out.println();
        baseFactoryWhite.createTriangle(1.3, 1.3, 1.3);
        System.out.println();
        System.out.println();

        System.out.println("Creating circles:");
        baseFactoryBlack.createCircle();
        System.out.println();
        baseFactoryWhite.createCircle();
        System.out.println();
        System.out.println();

        System.out.println("Creating circles with parameters:");
        baseFactoryBlack.createCircle(1.2);
        System.out.println();
        baseFactoryWhite.createCircle(1.3);
        System.out.println();
        System.out.println();
    }
}
