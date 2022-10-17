package com.groupproject;

public abstract class AbstractFactory {
    public static BaseFactory getFactory(Color color){
        if(color.equals(Color.White)){
            return (BaseFactory) new WhiteFactory();
        }
        else{
            return (BaseFactory) new BlackFactory();
        }
    }
}
