package NotUploaded.Medium;

import java.util.HashSet;

public class P3_LongestSubStringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left =0,right = 0,maxLength =0;
        HashSet<Character> set = new HashSet<>();
        while(right<n){
            if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                if (right - left +1 >maxLength){
                    maxLength = right - left +1;
                }
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
