package main;
import java.util.Arrays;
public class For_golovach {
    public static void main(String[] args){
        int[] array0 = {1,0,12,4,5,7,9,8,7,10,11};
       int[] array1 = new int [array0.length];

        for (int k=0; k < array0.length; k++) {
            System.out.print(" " + array0[k]);
        }
        System.out.println();
        for(int k= array0.length-1;k>=0;k--){
            System.out.print(" " + array0[k]);
        }
        System.out.println();
        System.out.println(Arrays.toString(array0));
    }
}
