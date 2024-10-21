import java.util.*;

// Driver Class
class IntegerSumWithTokenizer {
    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a line of integers separated by spaces: ");
        String inputLine = scanner.nextLine();

        // Create a StringTokenizer to tokenize the input line
        StringTokenizer st = new StringTokenizer(inputLine, " ");
        int sum = 0;

        System.out.println("The integers are:");

        // Process each token
        while (st.hasMoreTokens()) {
            // Getting the next token
            String token = st.nextToken();
            int number = Integer.parseInt(token); // Convert the token to an integer
            System.out.println(number); // Display the integer
            sum += number; // Add to the sum
        }

        // Display the sum of all integers
        System.out.println("The sum of all integers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
