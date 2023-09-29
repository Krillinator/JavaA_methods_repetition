package com.kristoffer.repetitionMetoder;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("What's your name?");
            TimeUnit.SECONDS.sleep(3);
            sc.nextLine();

        } while (true);

    }
}