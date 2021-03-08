import java.util.*;

public class Day7Challenge2MyHasMap {
    /** Initialize your data structure here. */
    int[] data;
    public Day7Challenge2MyHasMap() {
        data = new int[1000000];
        //Arrays.fill(data,-1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        data[key] = value+1;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return data[key]-1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        data[key] = 0;
    }


    /**
     * Your MyHashMap object will be instantiated and called as such:
     * MyHashMap obj = new MyHashMap();
     * obj.put(key,value);
     * int param_2 = obj.get(key);
     * obj.remove(key);
     */

    public static void main(String[] args) {
        Day7Challenge2MyHasMap obj=new Day7Challenge2MyHasMap();

    obj.put(5,8);
    int param_2 = obj.get(5);
    System.out.println(param_2);
    obj.remove(5);
    System.out.println(obj.get(5));
    }
}
