/**
* Question Link: https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3663/

*/


class MyHashMap {

    /** Initialize your data structure here. */
    
    int[] map;
    public MyHashMap() {
        map = new int[1000000];
        for(int i = 0; i < map.length; i++){
            map[i] = -1; //initially no value in the hashmap
        }
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        map[key] = value; //updates key index with the value
        
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return map[key]; //returns the value in the key index
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        map[key] = -1; // -1 denotes the is no value present
    
    }
    
}
    


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */