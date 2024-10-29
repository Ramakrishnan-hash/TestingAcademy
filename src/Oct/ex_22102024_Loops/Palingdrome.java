package Oct.ex_22102024_Loops;

import java.util.Scanner;

public class Palingdrome {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Value");
        String value = s.next();
        char charcter [] = value.toCharArray();
        int left = 0, right = charcter.length - 1;
        while(left < right){
            char temp = charcter[left];
            charcter[left] = charcter[right];
            charcter[right] = temp;
            left++;
            right--;
        }
        String reverseValue = new String(charcter);
        System.out.println(reverseValue);
        if(value.equals(reverseValue)){  //value variable will create in SCP and reverseValue will create in heap area/object area
            // == (Comparision operator) --> This will check the reference location.
            // Whereas equals will check the value.
            System.out.println("The String is Pallingdrome");
        }
        else{
            System.out.println("The String is not a Pallingdrome");
        }
        s.close();
    }
}
