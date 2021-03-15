
//Question: https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3669/




class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        Set<String> set = new HashSet();
        
        for(int i = 0; i <= s.length()-k; i++){
            set.add(s.substring(i, i + k));
        }
        return set.size() == Math.pow(2,k);
    }
}