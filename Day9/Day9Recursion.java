import java.util.Scanner;

public class Day9Recursion {


        // factorial function using recursion.
        public static int factorial(int n) {
            if(n<=1){
                return 1;
            }
            return n*factorial(n-1);

        }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a number: ");
         int n=scanner.nextInt();
         System.out.println(n+" factorial is "+factorial(n));
    }

}
