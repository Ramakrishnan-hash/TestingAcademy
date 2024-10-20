import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Conversion Program");
        System.out.println("Choose a conversion option:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Kilometers to Miles
                System.out.print("Enter distance in kilometers: ");
                double kilometers = scanner.nextDouble();
                double miles = kilometers * 0.621371; // 1 km = 0.621371 miles
                System.out.printf("%.2f kilometers is equal to %.2f miles%n", kilometers, miles);
                break;

            case 2:
                // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9; // (F - 32) * 5/9 = C
                System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius%n", fahrenheit, celsius);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }

        scanner.close();
    }
}
