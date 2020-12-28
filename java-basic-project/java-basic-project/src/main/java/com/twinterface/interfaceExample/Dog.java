package com.twinterface.interfaceExample;//实现语法参考Cat类
//接口可被多个类实现

public class Dog implements Animal {
    @Override
    public String animalSound() {
        return "woof woof woof";
    }

    @Override
    public String run() {
        return "running dog";
    }
}
