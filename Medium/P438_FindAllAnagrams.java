package Medium;

public class P438_FindAllAnagrams {
  public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] window = new int[26];

        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }
        int left = 0, right = 0;
        while (right < s.length()) {
            window[s.charAt(right) - 'a']++;

            if (right - left +1 == p.length()){
                if (Arrays.equals(pCount,window)){
                    result.add(left);
                }
                window[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return result;
    }
}
