package ArrayList2; 
import java.util.ArrayList;

public class RemoveColor {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Remove 2nd element (index starts from 0, so index 1 = 2nd element)
        colors.remove(1);

        // Remove element by value ("Blue")
        colors.remove("Blue");

        // Display updated list
        System.out.println("Updated List: " + colors);
    }
}