import java.util.Scanner;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        // Step 1: If lengths are different, cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

         // Step 2: Create frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Step 3: Count characters
        // Increment for s, decrement for t
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        // Step 4: Check frequency array
        // If any value is not zero, strings are not anagrams
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        // Step 5: All counts are zero → strings are anagrams
        return true;
    }

    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Ask user for first string
        System.out.print("Enter the first string: ");
        String s = scanner.nextLine().toLowerCase();  // convert to lowercase

        // Ask user for second string
        System.out.print("Enter the second string: ");
        String t = scanner.nextLine().toLowerCase();  // convert to lowercase

        // Call the isAnagram function and print result
        if (isAnagram(s, t)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

