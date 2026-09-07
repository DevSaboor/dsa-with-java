import java.util.Scanner;

public class mini_project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== Unit Converter =====");
            System.out.println("1. Celsius → Fahrenheit");
            System.out.println("2. Celsius → Kelvin");
            System.out.println("3. Kilometers → Miles");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();

                if (celsius < -273.15) {
                    System.out.println("Invalid temperature.");
                } else {
                    // Type promotion converts 9 and 5 during the double calculation
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("Fahrenheit = " + fahrenheit);
                }

            } else if (choice == 2) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();

                if (celsius < -273.15) {
                    System.out.println("Invalid temperature.");
                } else {
                    double kelvin = celsius + 273.15;
                    System.out.println("Kelvin = " + kelvin);
                }

            } else if (choice == 3) {
                System.out.print("Enter distance in Kilometers: ");
                double km = scanner.nextDouble();

                double miles = km * 0.621371;
                System.out.println("Miles = " + miles);

            } else if (choice == 4) {
                System.out.println("Goodbye!");

            } else {
                System.out.println("Invalid choice. Please pick an option from 1 to 4.");
            }
        }

        scanner.close();
    }
}