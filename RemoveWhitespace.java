package list5;
public class RemoveWhitespace {

    // Function to remove whitespace
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        String str = "Hello World Java";

        System.out.println("Without spaces: " + removeWhitespace(str));
    }
}