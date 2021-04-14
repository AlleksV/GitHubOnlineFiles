package main;

public class three {
    public static void main (String[] args){
        int int1 = 888;
        int num2 = 8;

        int res = int1 +num2;

        if ( int1 < num2 || 100 < res ) {
            System.out.println("правда");
        } else {
            System.out.println("неправда");
        }

        if ( int1 == num2 && 100 > res ) {
            System.out.println("правда2");
        } else {
            System.out.println("неправда2");
        }
    }
}
