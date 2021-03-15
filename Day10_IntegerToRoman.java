//Question: https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3667/

class Solution {
    public String intToRoman(int num) {
        
    int[] inCode = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    String[] code     = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
       
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < inCode.length; i++){
            while(num >= inCode[i]){
                sb.append(code[i]);
                num-=inCode[i];
            }
        }
        return sb.toString();
    }
}