package main;

import java.io.IOException;

public class Condition {
    public static void main (String [] args) throws IOException {
        char ch, answer = 'B';
        System.out.println("какую букву я загадал?");
        System.out.print("попробуй угадать:");
        ch = (char)System.in.read();
        if (ch==answer) {
            System.out.println("Угадав!");
        } else if(ch>answer) {
            System.out.println("на начало алфавита");
        } else {
            System.out.println(" в конец алфавита");
        }



    }
}
