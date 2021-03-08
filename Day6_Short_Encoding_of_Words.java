//https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3662/

class Day6_Short_Encoding_of_Words{
    public int minimumLengthEncoding(String[] string) {
        int result;
        Set<String> set = new HashSet<>(Arrays.asList(string));
        
        for (String word : string){
                if (set.contains(word)){
                    for (int i = 1; i < word.length(); i++){ 
                        set.remove(word.substring(i));
                    }
                }
        }
                    
                
        result = set.size();
                    
        for (String word : set) {
            result += word.length();
        }
        return result;
    }
}        