//https://www.hackerrank.com/challenges/30-review-loop/problem

import java.io.*;
import java.util.*;

public class Day6 _Review_even-indexed-and-odd-indexed-characters{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        in.nextLine();
        
        for (int i = 0; i < number; i++) {
            String string = in.nextLine();
            char[] arrayvalue = string.toCharArray();

            // loop to take the value at even index
            for (int j = 0; j < arrayvalue.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(arrayvalue[j]);
                }
            }

            System.out.print(" "); // putting space between two words 
            
            // loop to take the value at odd index
            for (int j = 0; j < arrayvalue.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(arrayvalue[j]);
                }
            }

            System.out.println();
        }

        in.close();
    }
}