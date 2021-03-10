import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {
       
       // Find the distinct types of candies in the array 
       HashSet<Integer> setOfCandies = new HashSet();
       for(int element: candyType){
           setOfCandies.add(element);
       }
       int kindsOfCandy = setOfCandies.size();
       
        // Calculate allowable number of candies.
       int allowableCandies = candyType.length / 2;
       
       if (allowableCandies <= kindsOfCandy){
           return allowableCandies;
       } 
        return kindsOfCandy;
    }
}
