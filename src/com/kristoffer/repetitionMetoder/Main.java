package com.kristoffer.repetitionMetoder;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Loop --> infinite --> YES | NO
        // for loop (x)     VS     do-while (1 + X)
        // continue; what does it do?

        // Instantiation
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("TESTING");
            String answer = scanner.nextLine();

            if (answer.equals("YES")) {
                sayHello();
            }

            if (answer.equals("NO")) {
                break;
            }

        } while(true);
        System.out.println("EXITING PROGRAM - PEACEFULLY");
    }

    public static void sayHello() {
        System.out.println("WELCOME ALL PLAYERS");
    }

}