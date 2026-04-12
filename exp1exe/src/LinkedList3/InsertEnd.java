package LinkedList3;
import java.util.LinkedList;

public class InsertEnd {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> l_listobj = new LinkedList<>();

        // Add elements
        l_listobj.add("Red");
        l_listobj.add("Blue");
        l_listobj.add("Green");

        // Insert element at the end
        l_listobj.offerLast("Pink");

        // Display updated list
        System.out.println("After inserting at end: " + l_listobj);
    }
}