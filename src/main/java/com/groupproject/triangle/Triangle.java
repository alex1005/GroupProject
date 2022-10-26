package com.groupproject.triangle;

public abstract class Triangle {
    protected float lengthOne;
    protected float lengthTwo;
    protected float lengthThree;


    public Triangle() {
        lengthOne = 1;
        lengthTwo = 1;
        lengthThree = 1;
    }

    public Triangle(int a, int b, int c) throws Exception {
        boolean triInq = triangleInequality(a, b, c);
        if (!triInq) {
            throw new Exception("Triangle Inequality");
        } else {
            lengthOne = a;
            lengthTwo = b;
            lengthThree = c;

        }
    }

    public boolean triangleInequality(int a, int b, int c) {
        return (a < b + c && b < a + c && c < a + b);
    }

    public float getLengthOne() {
        return lengthOne;
    }

    public float getLengthTwo() {
        return lengthTwo;
    }

    public float getLengthThree() {
        return lengthThree;
    }


    public void setLengthOne(float lengthParam) {
        lengthOne = lengthParam;
    }

    public void setLengthTwo(float lengthParam) {
        lengthTwo = lengthParam;
    }

    public void setLengthThree(float lengthParam) {
        lengthThree = lengthParam;
    }

    public String toString() {
        return "Triangle:" +
                "\n\tside one length = " + lengthOne +
                "\n\tside two length = " + lengthTwo +
                "\n\tside three length = " + lengthThree;
    }

    public void draw() {
        System.out.println(this);
    }

}


