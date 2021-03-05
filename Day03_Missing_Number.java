class Solution {
    public int missingNumber(int[] nums) {
       HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            set.add(i);
        }
        
        int count = nums.length+1;
        
        for(int i = 0; i < count; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}