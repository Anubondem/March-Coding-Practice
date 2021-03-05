import java.util.*;
import java.math.*;

class Solution {
    public int distributeCandies(int[] candies) {
        // Creating a Hashset and storing the candies
        HashSet<Integer> set = new HashSet();
        
        //adding all available candies
        for(int candy: candies){
            set.add(candy);
        }
        
        //Returns the minimum of the seize and half the length of candies
        return Math.min(set.size(), candies.length/2);
        
    }
}