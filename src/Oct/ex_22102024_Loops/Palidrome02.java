package Oct.ex_22102024_Loops;
import java.util.Scanner;
public class Palidrome02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
        String value = s.next();
        if(PCheck(value)){
            System.out.println("The String provided is Palidrome");
        }
        else{
            System.out.println("The String provided is not a Palidrome");
        }

    }

    static boolean PCheck(String value) {
        int left = 0, right = value.length() - 1;
        while (left < right) {
            if (value.charAt(left) != value.charAt(right)) {
                return false;
            }
            left++;
            right--;
            }
        return true;
    }
}
