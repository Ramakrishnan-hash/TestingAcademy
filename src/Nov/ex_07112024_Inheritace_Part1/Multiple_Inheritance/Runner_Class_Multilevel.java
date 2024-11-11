package Nov.ex_07112024_Inheritace_Part1.Multiple_Inheritance;

import java.util.Scanner;

public class Runner_Class_Multilevel {
    public static void main (String [] args){
        Child_Class2_Multilevel cc = new Child_Class2_Multilevel();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = sc.nextInt();
        cc.num1 = 100;
        cc.num2 = 200;
        cc.num3 = 300;
        cc.num4 = 400;
        cc.num5 = 500;
        cc.num6 = 600;
        System.out.println(cc.num1);
        System.out.println(cc.num2);
        System.out.println(cc.num3);
        System.out.println(cc.num4);
        System.out.println(cc.num5);
        System.out.println(cc.num6);
        System.out.println(cc.add(num1,num2));
        System.out.println(cc.sub(num1,num2));
        System.out.println(cc.mul(num1,num2));
        sc.close();
    }

}
