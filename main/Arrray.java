package main;

public class Arrray {
    public static void main(String[] args){
        int [] arrr = new int[12];
        for ( int i=0; i<10;i++) { //заполняем массив
            arrr[i]=i;

        }
        for (int e : arrr){
            System.out.println(e);// вывод масива
        }
    }
}
