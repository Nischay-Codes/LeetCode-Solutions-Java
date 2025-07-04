package BrutForce.NotUploaded.Easy;

public class P389_FindTheDifference {
    //Given two strings s and t, where t is generated by shuffling s and adding one extra character at a random position, find the extra character.
    public char findTheDifference(String s, String t) {
        boolean[] used = new boolean[s.length()];

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            boolean found = false;

            for (int j = 0; j < s.length(); j++) {
                if (!used[j] && s.charAt(j) == ch){
                    used[j] =true;
                    found = true;
                    break;
                }
            }
            if (!found){
                return ch;
            }
        }
        return ' ';
    }
}
