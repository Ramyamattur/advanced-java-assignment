package list6;
public class CapitalizeWords {

    // Function to capitalize words
    public static String capitalizeWords(String str) {

        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        String str = "java programming language";

        System.out.println(capitalizeWords(str));
    }
}