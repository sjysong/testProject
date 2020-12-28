package com.twinterface.interfacePracticeTwo;

import java.util.List;

public class AreaCalculator {
    public int calculateTotalArea(List<MyShape> shapes) {
        return shapes.get(0).shapesArea() + shapes.get(1).shapesArea();

    }

}
