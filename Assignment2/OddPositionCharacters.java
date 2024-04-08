import java.util.Scanner;

public class OddPositionCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Print odd position characters ignoring white spaces
        System.out.println("Odd position characters ignoring white spaces:");
        printOddPositionCharacters(text);

        scanner.close();
    }

    // Method to print odd position characters ignoring white spaces
    public static void printOddPositionCharacters(String text) {
        for (int i = 0; i < text.length(); i++) {
            // Skip white spaces
            if (text.charAt(i) == ' ') {
                continue;
            }
            // Print characters at odd positions
            if (i % 2 != 0) {
                System.out.print(text.charAt(i) + " ");
            }
        }
        System.out.println();
    }
}
