package ru.alfabank.homework14.scanner_14_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ScannerUtil {

    public void scannerAnimal(Animal animal) {
        System.out.println("\nInfo about " + animal.getClass() + ":");

        Field[] declaredFields = animal.getClass().getDeclaredFields();
        System.out.println("- declaredFields:");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field[] fields = animal.getClass().getFields();
        System.out.println("- Fields:");
        for (Field field : fields) {
            System.out.println(field);
        }

        Method[] declaredMethods = animal.getClass().getDeclaredMethods();
        System.out.println("- declaredMethods:");
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        Method[] methods = animal.getClass().getMethods();
        System.out.println("- Methods:");
        for (Method method : methods) {
            System.out.println(method);
        }

        Constructor<?>[] declaredConstructors = animal.getClass().getDeclaredConstructors();
        System.out.println("- declaredConstructor:");
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor<?>[] constructors = animal.getClass().getConstructors();
        System.out.println("- Constructors:");
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
