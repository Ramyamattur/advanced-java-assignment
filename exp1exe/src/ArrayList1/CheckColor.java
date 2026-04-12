package ArrayList1;
import java.util.ArrayList;

public class CheckColor {
    public static void main(String[] args) {

        // Create ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding elements to ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Check if "Red" is present using contains()
        if (colors.contains("Red")) {
            System.out.println("Red color is available");
        } else {
            System.out.println("Red color is NOT available");
        }
    }
}
 