package ArrayList4;
import java.util.*;

public class SubListExample {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Extract elements from index 0 to 1 (end index is exclusive)
        List<String> subList = colors.subList(0, 2);

        // Display extracted list
        System.out.println("Extracted elements: " + subList);
    }
}