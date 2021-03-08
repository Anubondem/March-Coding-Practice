
//Question Link: https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3662/


class Solution {
public:
    int minimumLengthEncoding(vector<string>& words) {
        
        //Creates two sets containing the words
        set<string>s1(words.begin(),words.end());
        set<string>s2(words.begin(),words.end());
        
        for(auto parts: s1){
            
            //Erases any substring in set 2 that is in both sets like me
            for(int i = 1; i <parts.size(); i++)
                s2.erase(parts.substr(i));
        }
        int sum = 0;
        for(auto parts: s2){
            sum += parts.size() + 1;
     }
        return sum;
    }
};