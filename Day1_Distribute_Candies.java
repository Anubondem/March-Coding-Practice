
//https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3657/



class Day1_Distribute_Candies {
    public int distributeCandies(int[] candyType) {
        
        //HashSet avoid repeatition of the candyType
        Set<Integer> type =new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            type.add(candyType[i]);
            
        }
        //returning the answer of chosen type
    if(type.size()>=candyType.length/2)
        return candyType.length/2;
    else
        return type.size();
    
        
        
    }
}