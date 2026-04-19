//2 a. Develop a java program for performing various string operations with different string handling functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()

package exp2a;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "  Java Programming  ";

        System.out.println("Original Strings:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = '" + str3 + "'");

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String s1 = "java";
        String s2 = "Java";
        System.out.println("\nUsing equals(): " + s1.equals(s2));
        System.out.println("Using equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));

        // 4. String Searching
        String text = "Java is powerful";
        System.out.println("\nIndex of 'is': " + text.indexOf("is"));
        System.out.println("Contains 'power': " + text.contains("power"));

        // 5. Substring Operations
        System.out.println("\nSubstring (0,4): " + text.substring(0, 4));

        // 6. String Modification
        System.out.println("\nUppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));

        // 7. Whitespace Handling
        System.out.println("\nBefore trim: '" + str3 + "'");
        System.out.println("After trim: '" + str3.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concat);

        // 9. String Splitting
        String sentence = "Java,Python,C,C++";
        String[] languages = sentence.split(",");
        System.out.println("\nSplit Result:");
        for (String lang : languages) {
            System.out.println(lang);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");

        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        int age = 20;
        String formatted = String.format("My name is %s and I am %d years old.", "Alice", age);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation
        String email = "example@gmail.com";

        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("\nEmail is valid (basic check)");
        } else {
            System.out.println("\nEmail is invalid");
        }
    }
}