package Oct.ex_16102024_ScannerClass;

public class Task03_Arguments {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]),num2 = Integer.parseInt(args[1]),num3 = Integer.parseInt(args[2]);
        int maxValue = (num1>=num2 && num1>=num3)? num1:(num2>num3?num2:num3);
        System.out.println("The max of 3 values is: "+ maxValue);
    }
}
