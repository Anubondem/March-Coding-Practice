//https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3659/

class Day3_MissingNumber{
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int sum_total=n*(n+1)/2; //sum of consecutive numbers
            
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int missing_number=sum_total-sum; // difference between sum_total and sum will give us the missing number
        
        return missing_number;
    }
}