import java.util.Arrays;
import java.util.HashSet;

public class Day6Challenge2WordsEncoding {
  //A method to return the length of the shortest reference string possible for any valid encoding of words
    public int minimumLengthEncoding(String[] words) {
        //HashSet to store list of words
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(words));
        //check for suffixes of words list and remove any matches from our set
        for (String word : words)
            if (hashSet.contains(word))
                for (int i = 1; i < word.length(); i++)
                    hashSet.remove(word.substring(i));
        int length = hashSet.size();
        for (String word : hashSet) length += word.length();
        return length;
    }

    public static void main(String[] args) {
        Day6Challenge2WordsEncoding encoding=new Day6Challenge2WordsEncoding();
        String[] words = {"time", "me", "bell"};
        System.out.println(encoding.minimumLengthEncoding(words));
    }
}
