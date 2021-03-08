
/**
* Question Link: https://www.hackerrank.com/challenges/30-review-loop/problem

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
    for(int k = 1; k <= T; k++){
         String s = scan.next();
       
        for(int i = 0; i< s.length(); i++){
            if(i%2 == 0){
             System.out.print(s.charAt(i));   
            }
        }  
          
        System.out.print(" ");
            
        for(int i = 0; i< s.length(); i++){
            if(i%2 != 0){
             System.out.print(s.charAt(i));   
            }
            
        }
        System.out.println(" ");
        
    }    
    }
}
