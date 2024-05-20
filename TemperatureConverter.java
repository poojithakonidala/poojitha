import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;
        int choice;

        System.out.print("Enter temperature: ");
        temperature = scanner.nextDouble();

        System.out.println("Select conversion:");
        System.out.println("1. Celsius");
        System.out.println("2. Kelvin");
        System.out.println("3. Fahrenheit");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Temperature in Celsius: " + temperature);
                break;
            case 2:
                System.out.println("Temperature in Kelvin: " + celsiusToKelvin(temperature));
                break;
            case 3:
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
 

