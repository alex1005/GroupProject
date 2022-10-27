package com.groupproject;

public abstract class AbstractFactory {
    public static BaseFactory getFactory(Color color){
        System.out.printf("AbstractFactory: getFactory(%s)%n", color);
        return switch(color) {
            case WHITE -> new WhiteFactory();
            case BLACK -> new BlackFactory();
        };
    }
}
