package Oct.ex_22102024_Loops;

import java.util.Scanner;

public class Reverse_the_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 5 digit number");
        int reverse = 0;
        for (int num = s.nextInt(); num!=0; num/=10){
            int digit = num%10;
            reverse = reverse * 10 + digit;
        }
      System.out.println("The reverse value is : " + reverse);
        s.close();
    }
}
