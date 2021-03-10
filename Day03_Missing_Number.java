/*Solution From: https://leetcode.com/problems/set-mismatch/discuss/105507/Java-O(n)-Time-O(1)-Space
Commented by me.

Link to problem: https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3659/
*/



/*This happens to be one interesting solution to the missing number problem.*/
public static int[] findErrorNums(int[] nums) {
    int[] res = new int[2];
    /*
    Criterion to Using This Approach: Array should contains values [1:n].
    
    When you pick a value in the array, you use that as an index to another number.
    We need to use take the absolute value because the value might have been update to negative.
    And if that number is positive, you turn it into a negative by multiplying -1.
    On the other hand, if the number is negative, it means the value used as an index is repeated.
    */
    for (int i : nums) {
        if (nums[Math.abs(i) - 1] < 0) res[0] = Math.abs(i);
	else nums[Math.abs(i) - 1] *= -1;
    }
    
    /*Now if we loop through the new array, the non negative number is the missing number*/
    for (int i=0;i<nums.length;i++) {
        if (nums[i] > 0) res[1] = i+1; //add 1 because we started counting from 0 instead of 1
    }
    return res;
}