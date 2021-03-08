import java.util.*;
public class Day7Challenge3LeftRotate {
        void leftRotate(int[] arr, int n, int d) {
            int []A=new int[d],B=new int[n-d],Ar=new int[A.length],Br=new int[B.length],ArBr=new int[n],BrAr=new int[n];
            for(int i=0;i<A.length;i++){
                A[i]=arr[i];
                Ar[i]=A[(A.length-1)-i];
            }
            for(int i=0;i<A.length;i++){
                Ar[i]=A[(A.length-1)-i];
            }

            for(int i=0;i<B.length;i++) {
                B[i]=arr[d+i];
                Br[i]=B[(B.length-1)-i];
            }
            for(int i=0;i<B.length;i++) {

                Br[i]=B[(B.length-1)-i];
            }

            for (int i=0;i<A.length;i++) {

                ArBr[i] = Ar[i];
            }

            for (int i=0;i<B.length;i++) {
                ArBr[d+i] = Br[i];
            }

            for (int i=0;i<arr.length;i++) {
                BrAr[i] = ArBr[(n - 1) - i];
                arr[i]=BrAr[i];
            }


            System.out.println(Arrays.toString(arr));
        }

    public static void main(String[] args) {
        Day7Challenge3LeftRotate sol=new Day7Challenge3LeftRotate();
        int n=7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int []arr2={7,9};
        int d=2;
        sol.leftRotate(arr,n,d);
    }
}
