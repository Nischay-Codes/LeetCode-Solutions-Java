package BruteForce.BurteForce.Easy;

public class P709_ToLowerCaseExample {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>='A'&&ch<='Z'){
                ch = (char) (ch+31);
            }
            result.append(ch);
        }
        return result.toString();
    }
}
