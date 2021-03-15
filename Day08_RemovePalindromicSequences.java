
// Question: https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3665/


class Solution {
    public int removePalindromeSub(String s) {
        
        if(s.isBlank())return 0; //checks if string is blank
        if(isPalindrome(s)) {
            return 1;
    
        }
        return 2;
    } 
    boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        
        
        }
        return true;
    }
}