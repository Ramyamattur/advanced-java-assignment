package list8;

public class IsNumeric {

    // Function to check numeric
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {

        String str = "12345";

        if (isNumeric(str)) {
            System.out.println("Numeric");
        } else {
            System.out.println("Not Numeric");
        }
    }
}