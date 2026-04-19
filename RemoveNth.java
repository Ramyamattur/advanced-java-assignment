//Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index

package ArrayList5;
import java.util.*;

public class RemoveNth {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Define n (nth element to remove)
        int n = 2;

        // Remove nth element (n-1 because index starts from 0)
        colors.remove(n - 1);

        // Display result
        System.out.println("After removing nth element: " + colors);
    }
}