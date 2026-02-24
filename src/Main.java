import java.util.Scanner;

public class PalindromeCheckerSimple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker ===");
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Convert to lowercase for case-insensitive comparison
        String normalized = input.toLowerCase();

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(normalized).reverse().toString();

        // Check if original and reversed are equal
        if (normalized.equals(reversed)) {
            System.out.println("✅ It is a Palindrome.");
        } else {
            System.out.println("❌ It is NOT a Palindrome.");
        }

        scanner.close();
    }
}