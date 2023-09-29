package com.kristoffer.repetitionMetoder;

public class Main {

    public static void main(String[] args) {

        // Instantiate Objects
        Student benny = new Student();

        benny.setAge(15);

        // Print age
        System.out.println(benny.age);
        System.out.println( test() );

        // Keywords
            // What is a 'keyword' //
            // Primitive Data-types //
            // for, if, switch, new //
            // 'this' //

            // Methods
                // v-modifiers (public) //
                // static (rule for Main) //
                // void (return) //
                // class //

    }

    // Methods
    // v-mod, static, return-type, name, () {}
    public static int test() {

        return 2+2;
    }

}