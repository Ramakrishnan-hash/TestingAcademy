package Oct.ex_11102024;

import java.sql.SQLOutput;

public class Lab001_Operators {
    public static void main (String [] args){
        int a = 48, b = 21;
        //Arithmetic operators - ( +, -, *, /, %, ++, --)
        System.out.println ("---------The Arithmetic operators--------------");
        System.out.println ("The Arithmetic operators values are: "+ (a + b)); // 69
        System.out.println ("The Arithmetic operators values are: "+ (a - b)); // 27
        System.out.println ("The Arithmetic operators values are: "+ (a * b)); // 1008
        System.out.println ("The Arithmetic operators values are: "+ (a / b)); // 2
        System.out.println ("The Arithmetic operators values are: "+ (a % b)); // 6

        // Assignment operators - ( =, +=, -=,*=, /=, %=)
        System.out.println ("---------The Assignment operators--------------");
        System.out.println ("The Assignment operators values are: "+ (a += b)); // 69 - a = 48, b = 21
        System.out.println ("The Assignment operators values are: "+ (a -= b)); // 48 - a = 69, b = 21
        System.out.println ("The Assignment operators values are: "+ (a *= b)); //1008 - a = 48, b = 21
        System.out.println ("The Assignment operators values are: "+ (a /= b)); // 48 - a = 1008, b = 21
        System.out.println ("The Assignment operators values are: "+ (a %= b)); // 6 - a = 48, b = 21

        // Comparison operators - ( ==, !=, >, <, >=, <=)
         a = 48;
        System.out.println ("---------The Comparison operators--------------");
        System.out.println ("The Comparison operators values are: "+ (a == b)); // False
        System.out.println ("The Comparison operators values are: "+ (a != b)); // True
        System.out.println ("The Comparison operators values are: "+ (a > b)); // True
        System.out.println ("The Comparison operators values are: "+ (a < b)); // False
        System.out.println ("The Comparison operators values are: "+ (a >= b)); // True
        System.out.println ("The Comparison operators values are: "+ (a <= b)); // False

        // Logical operators - (&&, ||, !)
        System.out.println ("---------The Logical operators--------------");
        System.out.println ("The Logical operators values are: "+ (a > b && a > 50)); // False
        System.out.println ("The Logical operators values are: "+ (a > b || a > 50)); // True
        System.out.println ("The Logical operators values are: "+ !((a > b && a > 50))); // True
    }
}
