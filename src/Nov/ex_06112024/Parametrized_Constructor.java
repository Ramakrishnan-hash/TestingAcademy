package Nov.ex_06112024;
import java.util.Scanner;
public class Parametrized_Constructor {
    public static void main(String[] args) {
        P_Constructor obj = new P_Constructor("Mathew", "Hyden",31);
        System.out.printf("Age of %s%s is %d \n",obj.First_name,obj.Last_name,obj.age);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name");
        String First_name = sc.nextLine();
        System.out.println("Enter the Last name");
        String Last_name = sc.nextLine();
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        P_Constructor obj1 = new P_Constructor(First_name,Last_name,age);
        System.out.printf("Age of %s%s is %d",obj1.First_name,obj1.Last_name,obj1.age);
    }
}

class P_Constructor {
    String First_name, Last_name;
    int age;

    P_Constructor(String FN, String LN, int age){
        this.First_name = FN;
        this.Last_name = LN;
        this.age = age;
    }

}