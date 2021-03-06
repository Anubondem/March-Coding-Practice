import java.util.*;
import java.lang.*;
//Challenge link: https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0#

public class Day5Challenge3RotateArray {
    /**
     * A method to perform array rotation
     * @param arr- Array to be rotated
     * @param D- number of elements rotation
     * @return- Rotated Array
     */
        public static int [] rotateArray(int[] arr, int D){
            int N=arr.length;
            //create new array to store rotated array
            int [] rotatedArray=new int[N];
            for(int i=0;i<N;i++){
                int newIndex=(i+N-D)%N; //new index of right rotated element
                rotatedArray[newIndex]=arr[i];
            }
            return rotatedArray;
        }
        public static void main (String[] args) {
            //code
            /*
            *input format
            * T            testcases
            * N D          Array length(N) and Number of right Rotations(D)
            * 1 2 3 4      array elements
            * N D
            * 43 12 32 2    array elements
             */
            Scanner scan=new Scanner(System.in);
            System.out.println("How many test Cases?  ");
            int T=scan.nextInt();
            for (int i=0;i<T;i++){
                System.out.println("Enter array length: ");
                int N=scan.nextInt();
                System.out.println("Enter the number of rotations to go: ");
                int D=scan.nextInt();


                int []array=new int[N];
                System.out.println("Enter array Values separated by space:  ");
                for(int j=0;j<N;j++){
                    array[j]=scan.nextInt();
                }
                int [] rotated=rotateArray(array,D);
                for (int it=0;it<rotated.length;it++){
                    System.out.print(rotated[it]+" ");

                }
                System.out.println(" ");

            }

        }
    }

