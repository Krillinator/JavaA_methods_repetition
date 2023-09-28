package com.kristoffer.repetitionMetoder;

public class Main {
    public static void main(String[] args) {

        // Object Creation AKA Instantiation
        Student benny = new Student(15, "Benny", true);
        Student frida = new Student(22, "Frida", false); // Var works!?

        // Set Object Values
        // benny.name = "Benny";

        // Print Object Values
        System.out.println(benny.name);
        System.out.println(benny.age);
        System.out.println(benny.isTired);

        System.out.println(frida.name);
        System.out.println(frida.age);
        System.out.println(frida.showIfSleepy());

    }
}
