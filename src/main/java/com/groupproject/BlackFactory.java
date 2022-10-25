package com.groupproject;

import com.groupproject.triangle.BlackTriangle;
import com.groupproject.triangle.WhiteTriangle;

public class BlackFactory implements BaseFactory {


    @Override
    public void createTriangle() {
        BlackTriangle whtTri = new BlackTriangle();
        whtTri.draw();

    }

    @Override
    public void createCircle() {

    }
}
