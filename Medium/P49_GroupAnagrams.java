package Medium;

import java.util.*;

public class P49_GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> map = new HashMap<>();
            for (String s : strs) {
                char[] c = s.toCharArray();
                Arrays.sort(c);
                String key = new String(c);

                if (!map.containsKey(key)){
                    map.put(key,new ArrayList<>());
                }
                map.get(key).add(s);
            }
            return new ArrayList<>(map.values());
        }
    }

}
