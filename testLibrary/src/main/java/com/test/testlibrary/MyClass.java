package com.test.testlibrary;

public class MyClass {

    public static void printValue(int upperLimit) {
        for (int i = 0; i < upperLimit; i++) {
            System.out.println(String.format("Number: %1$4d    Square: %2$4d", i, i*i));

        }
    }
}
