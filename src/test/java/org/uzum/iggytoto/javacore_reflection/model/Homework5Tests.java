package org.uzum.iggytoto.javacore_reflection.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Homework5Tests {

    @Test
    void test() {
        Homework5 homework5 = new Homework5();

        int age = 10;
        int feet = 5;
        int age2 = 11;
        String name = "Bobik";

        Cat cat = homework5.createAndUpdateWithReflection(age, feet, age2, name);

        Assertions.assertNotEquals(age, cat.getAge());
        Assertions.assertEquals(feet, cat.getFeet());
        Assertions.assertEquals(age2, cat.getAge());
        Assertions.assertEquals(name, cat.getName());
    }
}
