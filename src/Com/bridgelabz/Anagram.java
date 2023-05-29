package Com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("String1 = ");
        String string1 = scanner.nextLine();
        System.out.print("String2 = ");
        String string2 = scanner.nextLine();
        /*
        Convert to character Array for sorting the strings
         */
        char ch1[] = string1.toCharArray();
        char ch2[] = string2.toCharArray();
        // if the length of characters are not match then it is not anagram
        if (ch1.length != ch2.length) {
            System.out.println("Not an Anagram");
            System.exit(0);
        }
        /*
          Ch1 and ch2 are sorted in ascending order
         */
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        /*
        to check letters of each element is equal or not
         */
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                System.out.println("Not an Anagram");
                System.exit( 0);
            }
        }
        System.out.println("Strings are Anagram");
    }
}
