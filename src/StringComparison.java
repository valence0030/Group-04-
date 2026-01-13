import java.util.Scanner;
public class StringComparison {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Ask the user to enter two strings
            System.out.print("Enter the first string: ");
            String first = input.nextLine();

            System.out.print("Enter the second string: ");
            String second = input.nextLine();

            // Check if the strings are equal
            if (first.equals(second)) {
                System.out.println("The two strings are equal.");
            } else {
                System.out.println("The two strings are NOT equal.");
            }

            // Optional: show lengths (since the task mentions length())
            System.out.println("Length of first string: " + first.length());
            System.out.println("Length of second string: " + second.length());

            input.close();
        }
    }

