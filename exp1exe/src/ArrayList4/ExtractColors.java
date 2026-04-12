package ArrayList4;
import java.util.ArrayList;
import java.util.List;

public class ExtractColors {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Extract first and second elements (index 0 and 1)
        // Note: subList(start, end) → end index is excluded
        List<String> subList = colors.subList(0, 2);

        // Display extracted elements
        System.out.println("Extracted Elements: " + subList);
    }
}