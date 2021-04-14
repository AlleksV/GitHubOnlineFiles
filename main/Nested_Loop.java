package main;

import java.util.Arrays;

public class Nested_Loop {
    public static void main(String[] args) {
        int[] array_to_check = new int[]{2,2,2};
        if (array_to_check.length <= 1) {
            System.out.println("Масив із одним елементом");
          System.out.println(Arrays.toString(array_to_check));
        }

        else {
            for (int k = array_to_check.length - 1; k >= 0; k--) {
                for (int j = 0; j < k; j++) {

                    if (array_to_check[j] > array_to_check[j + 1]) {

                        int tmp = array_to_check[j];
                        array_to_check[j] = array_to_check[j + 1];
                        array_to_check[j + 1] = tmp;
                        System.out.println(Arrays.toString(array_to_check));
                    }
                    else {
                        System.out.println(Arrays.toString(array_to_check));
                    }
                }

            }
            System.out.println();
        }
    }
}

