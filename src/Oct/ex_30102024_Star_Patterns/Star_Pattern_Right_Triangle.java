package Oct.ex_30102024_Star_Patterns;
import java.util.Scanner;
public class Star_Pattern_Right_Triangle {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row value as 5");
        int row = sc.nextInt();
        System.out.println("Enter the column value as 5");
        int column = sc.nextInt();
        int array [][] = new int [row][column];
        System.out.println("Below is the right triange Star Pattern");
        for (int i =0;i<row;i++){
            for (int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
