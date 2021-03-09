/*
Link to this challenge : https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3665/
*/
public class Day8Challenge_2 {
    public int removePalindromeSub(String s) {
        int miniSum=0;
        int n=s.length();
        if(n==0){
            return 0;
        }
        if(n==1 || isPalindrome(s)) {
            return 1;
        }
        else{
            for(int i=0;i<n;i++){
                if(isPalindrome(s.substring(0,i)) && isPalindrome(s.substring(i,n-1))){
                    return 2;
                }
            }
        }
        return 2;
    }

    public boolean isPalindrome(String str){
        if(str.length()==0 || str.length()==1) return true;
        if(str.charAt(0) != str.charAt(str.length()-1)) return false;
        return isPalindrome(str.substring(1,str.length()-1));
    }
}