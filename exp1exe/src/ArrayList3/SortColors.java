package ArrayList3;

import java.util.ArrayList;
import java.util.Collections;

public class SortColors {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Sort the ArrayList in ascending order
        Collections.sort(colors);

        // Print sorted list
        System.out.println("Sorted List: " + colors);
    }
}