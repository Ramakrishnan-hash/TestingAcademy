package Oct.ex_16102024_ScannerClass;

public class Task02_Arguments {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]),num2 = Integer.parseInt(args[1]);
        int maxValue = num1 > num2 ? num1 : num2;
        System.out.println(maxValue);
    }
}
