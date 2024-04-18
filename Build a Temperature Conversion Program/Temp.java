import java.util.Scanner;

public class Temp{

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    // Function to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Function to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return kelvin * 9 / 5 - 459.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion!\n");

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the original unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String originalUnit = scanner.next().toLowerCase();

        double convertedValue1 = 0, convertedValue2 = 0;

        if (originalUnit.equals("celsius")) {
            convertedValue1 = celsiusToFahrenheit(temperature);
            convertedValue2 = celsiusToKelvin(temperature);
            System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit and %.2f Kelvin.\n", temperature, convertedValue1, convertedValue2);
        } else if (originalUnit.equals("fahrenheit")) {
            convertedValue1 = fahrenheitToCelsius(temperature);
            convertedValue2 = fahrenheitToKelvin(temperature);
            System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius and %.2f Kelvin.\n", temperature, convertedValue1, convertedValue2);
        } else if (originalUnit.equals("kelvin")) {
            convertedValue1 = kelvinToCelsius(temperature);
            convertedValue2 = kelvinToFahrenheit(temperature);
            System.out.printf("%.2f Kelvin is equal to %.2f degrees Celsius and %.2f Fahrenheit.\n", temperature, convertedValue1, convertedValue2);
        } else {
            System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
        }

        scanner.close();
    }
}
