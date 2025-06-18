public class P242_ValidAnagram {
    public boolean isValidAnagram(String s,String t){
        if (s.length() != t.length()) return false;

        int[] letters = new int[26];

        for(char c : s.toCharArray()){
            letters[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            letters[c - 'a']--;
            if (letters[c - 'a']<0) return false; //Use it, but rollback if overused
        }
        return true;
    }
}
