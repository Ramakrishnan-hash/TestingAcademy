package Oct.ex_23102024_methods;

import java.util.Scanner;

public class Methods {

    static void addition (int a , int b){
        int c = a + b;
        System.out.println("The addition of two values is: "+ c);
    }
    static int subraction (int a , int b){
        int c = a - b;
        return c;
    }
    static int multiplication (int a , int b){
        int c = a * b;
        return c;
    }
    static int division (int a , int b){
        int c = a/b;
        return c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st digit");
        int a = s.nextInt();
        System.out.println("Enter the 2nd digit");
        int b = s.nextInt();
        int returnValue = subraction(a,b);
        int returnValue1 = multiplication(a,b);
        int returnValue2 = division(a,b);
        addition(a,b);
        System.out.println("The subraction of two values is: "+ returnValue);
        System.out.println("The multiplication of two values is: "+ returnValue1);
        System.out.println("The division of two values is: "+ returnValue2);
        s.close();
    }
}
