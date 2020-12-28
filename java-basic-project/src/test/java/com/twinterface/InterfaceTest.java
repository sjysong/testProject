package com.twinterface;

import com.twinterface.interfaceExample.Animal;
import com.twinterface.interfaceExample.Cat;
import com.twinterface.interfaceExample.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterfaceTest {
    @Test
    public void should_return_different_sound() {
        //注意 此次变量类型均声明为Animal
        Animal cat = new Cat();
        Animal dog = new Dog();

        String catSound = cat.animalSound();
        String dogSound = dog.animalSound();

        assertEquals("miaow miaow miaow", catSound);
        assertEquals("woof woof woof", dogSound);
    }
}
