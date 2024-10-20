package Oct.ex_17102024_ConditionalStatements;

import java.util.Scanner;

public class Task01_GradeCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the mark");
        int mark = s.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("The Grade is: "+'A');
        }
        else if(mark>=80 && mark<90) {
            System.out.println("The Grade is: " + 'B');
        }
        else if(mark>=70 && mark<80) {
            System.out.println("The Grade is: " + 'C');
        }
        else if(mark>=60 && mark<70) {
            System.out.println("The Grade is: " + 'D');
        }
        else if(mark>100 || mark < 0) {
            System.out.println("Invalid Mark Details");
        }
        else{
            System.out.println("The Grade is: " + 'F');
        }
        s.close();
    }
}
