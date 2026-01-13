public class computerScience {
        public static void main(String[] args) {
            // Firstly, Create a String variable
            String text = "Computer Science";

            // Secondly, Print the first character
            System.out.println("First character: " + text.charAt(0));

            // Thirdly, Print the last character
            System.out.println("Last character: " + text.charAt(text.length() - 1));

            // Lastly, Extract the word "Science"
            String extracted = text.substring(8,16);
            System.out.println("Extracted word: " + extracted);
        }

}
