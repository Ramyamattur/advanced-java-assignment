//Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
package LinkedList1;
import java.util.*;

public class IterateFromSecond {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // Create iterator starting from index 1 (2nd position)
        Iterator<String> itr = list.listIterator(1);

        // Traverse elements
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}