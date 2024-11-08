package Oct.ex_30102024_Star_Patterns;
import java.util.Scanner;
public class Array_Declaration_with_User_Input_for_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of an 2D array");
        int size1 = sc.nextInt();
        System.out.println("Enter the column of an 2D array");
        int size2 = sc.nextInt();
        int array [][] = new int [size1][size2];
        for (int i =0;i<size1;i++){
            for (int j =0; j<size2;j++){
                System.out.println("Element position is "+ i + j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array values are");
        for (int i =0;i<size1;i++){
            for (int j =0; j<size2;j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println("");
        }

    }
}
