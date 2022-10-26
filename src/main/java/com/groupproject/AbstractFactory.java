package com.groupproject;

public abstract class AbstractFactory {
    public static BaseFactory getFactory(Color color){
        return switch(color) {
            case WHITE -> new WhiteFactory();
            case BLACK -> new BlackFactory();
            default -> throw new IllegalArgumentException("Unknown color");
        };
    }
}
