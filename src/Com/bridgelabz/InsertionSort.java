package Com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort <T>{
    public static <T extends Comparable<T>> void sorting(T[] array) {
        //sort string array using Arrays.sort method
        System.out.println("Sorted order is:- ");

        for(int i=0; i<array.length; i++)
        {
            Arrays.sort(array);
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        /*
            Reads in strings and prints them in sorted order using insertion sort.
         */
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of words to be printed: ");
            int size = scanner.nextInt();

            //create string array
            String array[] = new String[size];
            System.out.println();
            System.out.println("Enter the words to be printed: ");
            for(int i=0; i<array.length; i++)
            {
                array[i] = scanner.next();
            }
            System.out.println();
            sorting(array);
        }
    }
}
