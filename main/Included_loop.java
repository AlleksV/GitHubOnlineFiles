package main;

public class Included_loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("(" + i + ";" + j + ")");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("(" + i + ";" + j + ")");
            }
            System.out.println();
        }
        int[] arr = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}