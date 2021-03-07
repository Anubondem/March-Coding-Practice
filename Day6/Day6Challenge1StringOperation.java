/*
Link to this challenge:  https://www.hackerrank.com/challenges/30-review-loop/problem
 */
import java.util.*;

    public class Day6Challenge1StringOperation {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            System.out.println("This program divides and prints with a space between the even and odd positions of " +
                    "characters of  string in one line.");
            Scanner scan =new Scanner(System.in);
            System.out.print("Enter the number of test cases: ");
            int T =scan.nextInt();
            for(int i=0;i<T;i++){
                //use StringBuilder to store characters at even and odd positions
                StringBuilder evenIndexed=new StringBuilder();
                StringBuilder oddIndexed=new StringBuilder();
                System.out.print("Enter a word: ");
                String S=scan.next();

                for(int j=0;j<S.length();j++){
                    if(j%2 !=0) oddIndexed.append(S.charAt(j));
                    else evenIndexed.append(S.charAt(j));
                }
                System.out.println(evenIndexed.toString()+" "+oddIndexed.toString());

            }
        }
}
