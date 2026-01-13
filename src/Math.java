import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept a number from the user
        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        // Display square root
        // Calculate the square root
        double result = java.lang.Math.sqrt(num);


        System.out.println("Square root: " + java.lang.Math.sqrt(num));

        // Display power (number squared)
        System.out.println("Number squared: " + java.lang.Math.pow(num, 2));

        // Display value of pi
        System.out.println("Value of PI: " + java.lang.Math.PI);

        // Generate a random floating-point number between 0 and 1
        double randomValue = java.lang.Math.random();
        System.out.println("Random number (0 to 1): " + randomValue);

        input.close();
    }
}