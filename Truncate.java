package list7;

public class Truncate {

    // Function to truncate string
    public static String truncate(String str, int length) {

        if (str.length() <= length) {
            return str;
        }

        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {

        String str = "Hello Java Programming";

        System.out.println(truncate(str, 10));
    }
}