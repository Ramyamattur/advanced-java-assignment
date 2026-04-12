package LinkedList4; 
import java.util.LinkedList;

public class DisplayPosition {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> l_listobj = new LinkedList<>();

        // Add elements
        l_listobj.add("Red");
        l_listobj.add("Blue");
        l_listobj.add("Green");
        l_listobj.add("Yellow");

        // Display elements with index (position)
        for (int p = 0; p < l_listobj.size(); p++) {
            System.out.println("Position " + p + " : " + l_listobj.get(p));
        }
    }
}
