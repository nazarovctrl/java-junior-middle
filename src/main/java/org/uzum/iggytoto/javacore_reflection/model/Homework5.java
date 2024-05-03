package org.uzum.iggytoto.javacore_reflection.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Homework5 {

    public Cat createAndUpdateWithReflection(int age, int feet, int age2, String name) {
        try {
            //create object
            Class<Cat> catClass = Cat.class;
            Constructor<?> declaredConstructors = catClass.getConstructors()[0];
            Cat cat = (Cat) declaredConstructors.newInstance(age);

            //update fields
            Field[] declaredFields = cat.getClass().getSuperclass().getDeclaredFields();

            Field feetField = declaredFields[0];
            Field ageField = declaredFields[1];
            Field nameField = declaredFields[2];

            feetField.setAccessible(true);
            ageField.setAccessible(true);

            feetField.set(cat, feet);
            ageField.set(cat, age2);
            nameField.set(cat, name);

            return cat;
        } catch (InvocationTargetException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

}
