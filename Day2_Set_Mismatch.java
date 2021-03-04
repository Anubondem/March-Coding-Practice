//https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3658/

class Day2_Set_Mismatch{
    public int[] findErrorNums(int[] nums) {
        int[] results = new int[2];
        for(int i=0;i<nums.length;i++){
            
            // checking for the index of repeated number
            if((i+1)%nums[i]!=0){
                results[0]=nums[i-1];
                results[1]=nums[i-1]+1;
            }
            
        }
        return results;
    }
}
            
           