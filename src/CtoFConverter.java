import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempCel;
        double tempFar;
        while (true) {
            System.out.print("Enter a temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                tempCel = scanner.nextDouble();
                tempFar = (tempCel * 9 / 5) + 32;
                System.out.println("Equivalent temperature in Fahrenheit: " + tempFar);
                break;
            }
            else {
                System.out.println("Invalid input. Please enter a valid temperature.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        scanner.close();
    }
}
