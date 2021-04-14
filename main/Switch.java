package main;

import java.io.IOException;

public class Switch {
    public static void main (String [] args) throws IOException {
        int month;
        month = 5;


        String monthString;
        switch (month) {
            case 1: monthString = "январь";
            break;
            case 2: monthString = "февраль";
            break;
            case 3: monthString = "март";
            break;
            case 4: monthString = "апрель";
            break;
            default:monthString = "не знаем такого :)";
            break;

        }
        System.out.println(monthString);


    }
}
