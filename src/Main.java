import java.util.Scanner;

public class PalindromeCheckerUC3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App - UC3 ===");
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        // Convert to lowercase for case-insensitive comparison
        original = original.toLowerCase();

        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String Concatenation
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("✅ It is a Palindrome.");
        } else {
            System.out.println("❌ It is NOT a Palindrome.");
        }

        scanner.close();
    }
}