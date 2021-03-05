class Solution {
    public int[] findErrorNums(int[] nums) {
        
        //declares and initialises the arrays
        int[] arr = new int[nums.length];
        int[] results = new int[2];
        
        //increases the count of each element in the array by 1
        for(int i: nums){
            arr[i-1]++;
        }
        
        //loops through the array
        for(int i=0; i<arr.length; i++){
            
            //if the count is twice, store it at the first position of the result array
            if(arr[i]==2){
                results[0] = i+1;
            }
            //if the count is zero, then number is missing
            if(arr[i]==0){
                results[1]=i+1;
            }
        }
        
        return results;
        
    }
}