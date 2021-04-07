
import java.util.*;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] elements){
        this.elements=elements;
    }
    
    int computeDifference(){
        maximumDifference=0;
        for(int i=0;i<this.elements.length;i++){
            for(int j=0;j<this.elements.length;j++){
               int temp=Math.abs(this.elements[i]-this.elements[j]);
               if(temp>maximumDifference){
                   maximumDifference=temp;
               }
            }
        }
        return maximumDifference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array elements separated by space: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print("Maximum difference between any two elements: \n"+difference.maximumDifference);
    }
}
