package BruteForce.BurteForce.Easy;

public class P1189_MaximumNumberBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] letters = new int[26];
        for(char c : text.toCharArray()){
            letters[c-'a']++;
        }
        int count = 0;
        while(true){
            if (    letters['b'-'a']>=1&&
                    letters['a'-'a']>=1&&
                    letters['l'-'a']>=2&&
                    letters['o'-'a']>=2&&
                    letters['n'-'a']>=1){
                
                    letters['b'-'a']--;
                    letters['a'-'a']--;
                    letters['l'-'a']-=2;
                    letters['o'-'a']-=2;
                    letters['n'-'a']--;

                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
