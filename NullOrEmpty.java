package list1;
import java.util.*;

public class NullOrEmpty {

    // Function to check null or whitespace
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {

        String str = "   ";

        // Call function
        if (isNullOrEmpty(str)) {
            System.out.println("String is null or empty");
        } else {
            System.out.println("String is NOT empty");
        }
    }
}
