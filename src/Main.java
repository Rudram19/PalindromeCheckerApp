import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerUC5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App - UC5 (Stack Based) ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));   // Push Operation
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {
            char poppedChar = stack.pop();   // Pop Operation

            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("✅ It is a Palindrome.");
        } else {
            System.out.println("❌ It is NOT a Palindrome.");
        }

        scanner.close();
    }
}