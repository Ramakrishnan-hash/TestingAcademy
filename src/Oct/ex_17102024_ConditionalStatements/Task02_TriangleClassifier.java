package Oct.ex_17102024_ConditionalStatements;

import java.util.Scanner;

public class Task02_TriangleClassifier {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int side1 = s.nextInt(),side2 = s.nextInt(),side3 = s.nextInt();
        if (side1==side2 && side2==side3){
            System.out.println("The Traingle is equilateral");
        }
        else if (side1==side2 || side2==side3|| side1==side3){
            System.out.println("The Traingle is isosceles");
        }
        else {
            System.out.println("The Traingle is scalene");
        }
        s.close();
    }
}
