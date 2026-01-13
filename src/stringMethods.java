import java.util.Scanner;
public class stringMethods {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Accept a string from the user
            System.out.print("Enter a string: ");
            String text = input.nextLine();

            // firstly, Display the string in uppercase
            System.out.println("Uppercase: " + text.toUpperCase());

            // secondly, Display the string in lowercase
            System.out.println("Lowercase: " + text.toLowerCase());

            // thirdly, Number of characters
            System.out.println("Number of characters: " + text.length());

            // fourthly, Count number of times 'a' appears
            int countA = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
                    countA++;
                }
            }
            System.out.println("Number of 'a' characters: " + countA);

            // fifthly, Replace spaces with underscores
            String replaced = text.replace(" ", "_");
            System.out.println("After replacing spaces: " + replaced);

            // -------------------------------
            // Task 4: STRING COMPARISON
            // -------------------------------
            System.out.print("\nEnter another string to compare: ");
            String text2 = input.nextLine();

            // Compare using equals()
            if (text.equals(text2)) {
                System.out.println("The two strings are EXACTLY equal.");
            } else {
                System.out.println("The two strings are NOT equal.");
            }

            // Compare using compareTo()
            int result = text.compareTo(text2);
            if (result == 0) {
                System.out.println("compareTo(): Strings are equal.");
            } else if (result < 0) {
                System.out.println("compareTo(): First string comes BEFORE the second.");
            } else {
                System.out.println("compareTo(): First string comes AFTER the second.");
            }

            input.close();
        }

}
