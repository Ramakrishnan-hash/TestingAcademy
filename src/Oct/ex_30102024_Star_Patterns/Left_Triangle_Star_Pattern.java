package Oct.ex_30102024_Star_Patterns;
import java.util.Scanner;
public class Left_Triangle_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row value as 5");
        int row = sc.nextInt();
        System.out.println("Left Triangle Star Pattern is");
        for (int i = row-1; i>=0; i--){
            for (int j =0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
