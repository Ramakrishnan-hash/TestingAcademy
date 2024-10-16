package Oct.ex_15102024_Terinaryoperator;

public class Lab002 {
    public static void main(String[] args) {
        int a = 67, b= 89, c  = 74;
        int maxValue = (a>=b && a>=c) ? a :(b>=c ? b : c);
        System.out.println("The max of 3 values is: "+ maxValue);
    }
}
