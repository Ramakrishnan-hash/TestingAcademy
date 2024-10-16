package Oct.ex_16102024_ScannerClass;

import java.util.Scanner;

public class Task01_ScannerClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();
        int age = s.nextInt();
        float salary = s.nextFloat();
        System.out.printf("%s, %d, %f",name,age,salary);
        s.close();
    }
}
