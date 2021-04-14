import java.util.Scanner;

public class ProgScanTom {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s;  Age: %d; Height: %.2f; \n", name, age, height);
        in.close();
    }
}
