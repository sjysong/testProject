package com.twinterface.interfacePracticeTwo;

public class MyRectangle implements MyShape {
    private int width;
    private int length;

    public MyRectangle() {

    }

    public MyRectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public int shapesArea() {
        if (width >= 0 && length >= 0) {
            return width * length;
        }
        return 0;
    }
}
