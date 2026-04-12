package ArrayList5;
import java.util.ArrayList;

public class DeleteNth {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Specify index to delete (example: 2 → 3rd element)
        int n = 2;

        // Check index validity before removing
        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
        } else {
            System.out.println("Invalid index");
        }

        // Print updated list
        System.out.println("After Deletion: " + colors);
    }
}