package main;

import javax.swing.border.EmptyBorder;
import java.util.Arrays;

public class Inverted_Bubble_Sort {
    public static void main(String[] args) {
        int[] array_to_check = new int[]{10,100,2,32,550,500,12,3,3,0};
        if (array_to_check.length == 1) {
            System.out.println("Масив із одним елементом");
            System.out.println(Arrays.toString(array_to_check));
       //     if (array_to_check.length  == ){
       //         System.out.println("None elements");
    //        }
        }
        else {
            for (int barierr = 0 ; barierr <= array_to_check.length; barierr++) {
                for (int index = array_to_check.length-1; index > barierr; index--) {

                    if (array_to_check[index] < array_to_check[index - 1]) {
                        int tmp = array_to_check[index];
                        array_to_check[index] = array_to_check[index - 1];
                        array_to_check[index - 1] = tmp;
                        System.out.println(Arrays.toString(array_to_check));
                   }
  //                      else{
 //                          System.out.println(Arrays.toString(array_to_check));
  //                      }
                }
            }
        }
    }
}

