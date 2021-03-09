/*
Given a 6x6 2D Array, arr :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
An hourglass in A is a subset of values with indices falling in this pattern in arr's graphical representation:

a b c
  d
e f g
There are 16 hourglasses in arr. An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every
hourglass in arr, then print the maximum hourglass sum. The array will always be 6x6 .

Example
-9 -9 -9  1 1 1
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
The 16 hourglass sums are:

-63, -34, -9, 12,
-10,   0, 28, 23,
-27, -11, -2, 10,
  9,  17, 25, 18
The highest hourglass sum is 28 from the hourglass beginning at row 1 , column 2:

0 4 3
  1
8 6 6

 */


public class Day8Challenge3_2DArray {


        // Complete the hourglassSum function below.
        static int hourglassSum(int[][] arr) {
            int totalsum=-1000;
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    int topsum=arr[i][j]+arr[i][j+1]+arr[i][j+2];
                    int middlesum=arr[i+1][j+1];
                    int bottomsum=arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    int sum=topsum+middlesum+bottomsum;
                    if(sum>totalsum){
                        totalsum=sum;
                    }
                }
            }
            return totalsum;
        }




    public static void main(String[] args){

//        int[][] arr = new int[6][6];
        int arr[][]={{-9,-9,-9,1,1,1},
                {0,-9,0,4,3,2},
                {-9,-9,-9,1,2,3},
                {0,0,8,6,6,0},
                {0,0,0,-2,0,0},
                {0,0,1,2,4,0}
        };

        int result = hourglassSum(arr);
        System.out.println(result);

    }
}

