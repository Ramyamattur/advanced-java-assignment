//Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
package ArrayList3;
import java.util.*;

public class SortColors {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Sort elements alphabetically
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted colors: " + colors);
    }
}