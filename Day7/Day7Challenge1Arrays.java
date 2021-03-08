
import java.util.*;

public class Day7Challenge1Arrays {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the length of the Array? ");
            int n = scanner.nextInt();


            int[] arr = new int[n];

            //String[] arrItems = scanner.nextLine().split(" ");

            System.out.println("Enter Array elements separated by spaces: ");
            for (int i = 0; i < n; i++) {
                //int arrItem = Integer.parseInt(arrItems[i]);
                //arr[i] = arrItem;
                arr[i]=scanner.nextInt();
            }
            //declare array with n length

            while(n>0){
                System.out.print(arr[n-1]+" ");
                n--;
            }

            scanner.close();
        }
    }
