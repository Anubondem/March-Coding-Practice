import java.util.Scanner;
public class Day5Challeng1Loop {
    //main method
    public static void main(String [] args){
        System.out.println("This Program prints up to 10 multiples of a a given integer.");
        //create scanner object to take input from user
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=scan.nextInt();
        System.out.println("-------------------------");
        //print up to 10, the multiples of the number with a while loop
        int i=1;
        while (i<=10){
            System.out.println(num+" x "+i+" = "+num*i);
            i++;
        }
    }
}
