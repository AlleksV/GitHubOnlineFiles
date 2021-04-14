package main;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two natural numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Enter what you want to do: 1. +, 2. -, 3. * or 4. /");
        int operation = in.nextInt();

        if (operation == 1) {
            System.out.print("Result: ");
            System.out.print(a + b);
        } else if (operation == 2) {
            System.out.print("Result: ");
            System.out.println(a - b);
        } else if (operation == 3) {
            System.out.print("Result: ");
            System.out.println(a * b);
        } else if (operation == 4) {
            System.out.print("Result: ");
            System.out.println(a / b);
        } else {
            System.out.println("Input an action number: 1 +, 2 -, 3 * or 4 /");
        }
    }
}

