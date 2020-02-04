import java.util.*;

public class anagrams {

        public List<List<String>> groupAnagrams(String[] arr) {
            Map<Set<String>, Integer> map = new HashMap<>();
            List<List<String>> list = new ArrayList<>();
            for (String i : arr){
               Arrays.sort(i.toCharArray());

            }

            return list;
        }

        public static void main(String [] args){
            anagrams a = new anagrams();
            String [] words = {"eat", "tea"};
            a.groupAnagrams(words);
        }

}
