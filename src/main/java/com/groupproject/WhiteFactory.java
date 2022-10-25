package com.groupproject;

import com.groupproject.triangle.WhiteTriangle;

public class WhiteFactory implements BaseFactory {


    @Override
    public void createTriangle() {
        WhiteTriangle whtTri = new WhiteTriangle();
        whtTri.draw();

    }

    @Override
    public void createCircle() {

    }
}
