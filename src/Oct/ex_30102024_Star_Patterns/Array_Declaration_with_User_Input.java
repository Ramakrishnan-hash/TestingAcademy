package Oct.ex_30102024_Star_Patterns;
import java.util.Scanner;
public class Array_Declaration_with_User_Input {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int array_size = sc.nextInt();
        int array [] = new int[array_size];
        for (int i =0; i <array_size; i++){
            System.out.println("Enter the Element "+ (i +1) + " Value");
            array[i] = sc.nextInt();
        }
        System.out.println("The values are below");
        for (int i = 0; i<array_size; i++){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
