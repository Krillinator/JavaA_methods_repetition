package com.kristoffer.repetitionMetoder;

public class Main {
    public static void main(String[] args) {

        test("Hello world");

        for (int i = 0; i < 100; i++) {
            test("Index: " + i);
        }

        System.out.println(addition(2, 8));

    }

    public static int addition(int x, int y) {

        return x + y;
    }

    public static void test(String message) {
        System.out.println(message);
    }

}
