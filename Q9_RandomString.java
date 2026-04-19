//Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()
package string;
 

import java.util.Random;
import java.util.Scanner;

public class Q9_RandomString {

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int len = sc.nextInt();

        System.out.println("Random String: " + generateRandomString(len));

        sc.close();
    }
}