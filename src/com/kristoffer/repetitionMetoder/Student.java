package com.kristoffer.repetitionMetoder;

public class Student {

    // Variables
    public int age;
    public String name;
    public boolean isTired;

    // Constructor
    public Student(int age, String name, boolean isTired) {
        this.age = age;
        this.name = name;
        this.isTired = isTired;
    }


    // Methods
    public String showIfSleepy() {

        if (isTired) {
            return name + " is VERY tired";
        } else {
            return name + " is NOT tired";
        }

    }

}
