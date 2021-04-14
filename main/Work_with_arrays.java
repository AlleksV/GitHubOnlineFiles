package main;

public class Work_with_arrays {
    public static void main(String[] args){
int[] arr = {0, 10,20,30,40,50,60,70,80,90,100};
for(int k = 0; k < arr.length; k++){
    System.out.print(arr[k] + " ");
}
        System.out.println();
for (int k = 0; k < arr.length; k+=2) System.out.print(arr[k] + " ");
        System.out.println();
for(int k = arr.length-1; k >= 0; k--){
    System.out.print(arr[k] + " ");
}
        System.out.println();
for(int k = arr.length-1; k >= 0; k-=3){
    System.out.print(arr[k] + " ");
        }
        System.out.println();
       for(int k = 0;  k < 10; k++){
            System.out.println(k + " ");
           k-=10000000;
        }
        System.out.println();


    }
}
