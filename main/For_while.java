package main;

import java.io.IOException;

public class For_while {
    public static void main(String[] args) throws IOException {
        int count = 0;
        while (count<10) {
            System.out.println(count);
            count++;
            if (count>5) break;
        }
 /*       int count = 0;
        while (count < 11){
            System.out.println(count);
            count+=2;
        }
*/
     //   for (int i =0; (char) System.in.read() != 'S'; i++)
      //  for (int i = 0; i < 10; i++)
       // System.out.println("Iteration" + i);
    }
}
