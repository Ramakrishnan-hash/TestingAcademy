package Oct.ex_18102024_SwitchCase;

import java.util.Scanner;

public class Task1_Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2 = s.nextInt();
        System.out.println("Enter the Operator");
        char operator = s.next().charAt(0);
        switch (operator) {
            case '+':
                int result = num1 + num2;
                System.out.println("The + of 2 values is : "+ result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("The - of 2 values is : "+ result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("The * of 2 values is : "+ result);
                break;
            case '/':
                if(num2!=0 && num2<num1) {
                    result = num1 / num2;
                    System.out.println("The / of 2 values is : " + result);
                }
                else if (num2>num1 || num2<0){
                    System.out.println("Invalid Inputs");
                }
                else {
                    System.out.println("Unable to divide");
                }
                break;
            case '%':
                if(num2!=0 && num2<num1) {
                    result = num1 % num2;
                    System.out.println("The % of 2 values is : " + result);
                }
                else if (num2>num1 || num2<0){
                    System.out.println("Invalid Inputs");
                }
                else {
                    System.out.println("Unable to divide");
                }
                break;
            default:
                System.out.println("Unable to Calculate");
        }
        s.close();
    }
}