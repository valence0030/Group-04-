import java.util.Scanner;
public class StringFormatting {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Accept student details
            System.out.print("Enter student's name: ");
            String name = input.nextLine();

            System.out.print("Enter registration number: ");
            String regNo = input.nextLine();

            System.out.print("Enter marks: ");
            double marks = input.nextDouble();

            // Display using string concatenation
            System.out.println("\n--- Using String Concatenation ---");
            System.out.println("Name: " + name);
            System.out.println("Registration Number: " + regNo);
            System.out.println("Marks: " + marks);

            // Display using printf()
            System.out.println("\n--- Using printf() ---");
            System.out.printf("Name: %s%n", name);
            System.out.printf("Registration Number: %s%n", regNo);
            System.out.printf("Marks: %.2f%n", marks);

            input.close();
        }
    }

