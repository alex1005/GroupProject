package com.groupproject;

public class Runner {
    public static void main(String[] args)  {

        WhiteFactory wf = new WhiteFactory();
        BlackFactory bf = new BlackFactory();

        wf.createTriangle();
        bf.createTriangle();
    }
}
