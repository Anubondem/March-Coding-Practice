
/*
Link to challenge: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 */
import java.util.*;


public class Day8Challenge1KeyMapping {

        public static void main(String []argh){
            HashMap<String,Integer> hashMap=new HashMap<>();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here
                hashMap.put(name,phone);
            }
            while(in.hasNext()){
                String s = in.next();
                // Write code here
                if(hashMap.get(s)==null){
                    System.out.println("Not found");
                }
                else {
                    System.out.println(s+"="+hashMap.get(s));
                }
            }
            in.close();
        }

}
