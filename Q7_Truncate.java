//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()
package string;

import java.util.Scanner;

public class Q7_Truncate {

    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter max length: ");
        int len = sc.nextInt();

        System.out.println("Truncated: " + truncate(input, len));

        sc.close();
    }
}