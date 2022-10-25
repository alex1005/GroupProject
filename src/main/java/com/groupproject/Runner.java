package com.groupproject;

public class Runner {
    public static void main(String[] args)  {
        BaseFactory baseFactoryBlack = AbstractFactory.getFactory(Color.BLACK);
        BaseFactory baseFactoryWhite = AbstractFactory.getFactory(Color.WHITE);
        baseFactoryBlack.createTriangle();
        baseFactoryWhite.createTriangle();
    }
}
