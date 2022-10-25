package com.groupproject;

public abstract class AbstractFactory {
    public static BaseFactory getFactory(Color color){
        return switch(color) {
            case WHITE -> (BaseFactory) new WhiteFactory();
            case BLACK -> (BaseFactory) new BlackFactory();
            default -> throw new IllegalArgumentException("Unknown color");
        };
    }
}
