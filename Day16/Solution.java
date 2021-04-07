/*
Link to problem: https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int s=Integer.parseInt(S);
            System.out.println(s);
        }catch(Exception e){
            System.out.println("Bad String");
        }
    }
}