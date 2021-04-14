package main;

import java.util.Scanner;

public class Change_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter next number");
        int b = in.nextInt();
        System.out.println("You input two numbers: " + a + " and " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
