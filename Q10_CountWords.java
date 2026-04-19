//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
package string;

import java.util.Scanner;

public class Q10_CountWords {

    public static int countWords(String str) {
        if (str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        System.out.println("Word Count: " + countWords(input));

        sc.close();
    }
}