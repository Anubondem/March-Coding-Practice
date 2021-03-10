/*
challenge 2: https://www.hackerrank.com/challenges/30-conditional-statements/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        int N = scanner.nextInt();
        // Find the modulo of the number to ease comparsion
        int modOfNumber = N%2;                  
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //Check if number is within some range and print a corresponding message
        if(modOfNumber != 0 ){
            System.out.println("Weird");
        }else if(modOfNumber == 0 && (N >=2 && N <=5)){
            System.out.println("Not Weird");
        }else if(modOfNumber == 0 && (N >=6 && N <=20)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
