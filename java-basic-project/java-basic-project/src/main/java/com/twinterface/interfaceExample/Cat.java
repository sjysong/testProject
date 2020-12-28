package com.twinterface.interfaceExample;//类Cat实现接口Animal
//实现关键字：implements
//类Cat需要实现接口Animal中所有的函数
//类Cat实现的接口函数，要用@Override标记

public class Cat implements Animal {
    @Override
    public String animalSound() {
        return "miaow miaow miaow";
    }

    @Override
    public String run() {
        return "The cat is running.";
    }
}
