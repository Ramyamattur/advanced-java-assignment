//Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList
package ArrayList2;
import java.util.*;

public class RemoveColors {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Remove 2nd element (index starts from 0)
        colors.remove(1);

        // Remove element "Blue" (by object)
        colors.remove("Blue");

        // Display result
        System.out.println("After removal: " + colors);
    }
}