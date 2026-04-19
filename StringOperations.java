//3a. Develop a java program for performing various string operations with different string handling functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()

package stringlab;


import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\n--- Basic Operations ---");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\n--- Length & Character Access ---");
        System.out.println("Length of String 1: " + str1.length());
        if (str1.length() > 0) {
            System.out.println("First character: " + str1.charAt(0));
        }

        // 3. String Comparison
        System.out.println("\n--- String Comparison ---");
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));

        // 4. String Searching
        System.out.println("\n--- String Searching ---");
        System.out.print("Enter word to search in String 1: ");
        String search = sc.nextLine();
        System.out.println("Contains '" + search + "': " + str1.contains(search));
        System.out.println("Index of '" + search + "': " + str1.indexOf(search));

        // 5. Substring Operations
        System.out.println("\n--- Substring ---");
        if (str1.length() >= 3) {
            System.out.println("Substring (0,3): " + str1.substring(0, 3));
        }

        // 6. String Modification
        System.out.println("\n--- Modification ---");
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Replace 'a' with '*': " + str1.replace('a', '*'));

        // 7. Whitespace Handling
        System.out.println("\n--- Whitespace Handling ---");
        String spaced = "   " + str1 + "   ";
        System.out.println("Before trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        // 8. String Concatenation
        System.out.println("\n--- Concatenation ---");
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        System.out.println("\n--- Splitting ---");
        String sample = "Java,Python,C,C++";
        String[] parts = sample.split(",");
        for (String s : parts) {
            System.out.println(s);
        }

        // 10. StringBuilder Demo
        System.out.println("\n--- StringBuilder Demo ---");
        StringBuilder sb = new StringBuilder(str1);
        sb.append(" AIET");
        sb.insert(0, "Welcome ");
        System.out.println("Result: " + sb);

        // 11. String Formatting
        System.out.println("\n--- Formatting ---");
        String formatted = String.format("Hello %s, length is %d", str1, str1.length());
        System.out.println(formatted);

        // 12. Email Validation
        System.out.println("\n--- Email Validation ---");
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        if (email.contains("@") && email.startsWith("a") && email.endsWith(".com")) {
            System.out.println("Valid Email (basic check)");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}