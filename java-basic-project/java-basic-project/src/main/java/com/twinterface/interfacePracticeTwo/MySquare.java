package com.twinterface.interfacePracticeTwo;

public class MySquare implements MyShape {
    private int length;

    public MySquare() {

    }

    public MySquare(int length) {
        this.length = length;
    }

    @Override
    public int shapesArea() {
        if (length >= 0) {
            return length * length;
        }
        return 0;
    }
}
