package list4;
public class Palindrome {

    // Function to check palindrome
    public static boolean isPalindrome(String str) {

        // Remove non-alphanumeric and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse string
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }

    public static void main(String[] args) {

        String str = "Madam";

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}