package ArrayList1;
import java.util.*;

public class ColorSearch {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        // Check if "Red" is present using contains()
        if (colors.contains("Red")) {
            System.out.println("Red color is available");
        } else {
            System.out.println("Red color is NOT available");
        }
    }
}