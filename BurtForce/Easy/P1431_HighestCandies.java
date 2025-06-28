package BruteForce.BurteForce.Easy;

import java.util.ArrayList;
import java.util.List;

public class P1431_HighestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> answer = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int total = candies[i]+extraCandies;
            boolean isGreatest = true;
            for (int j = 0; j < candies.length; j++) {
                if (total<candies[j]){
                    isGreatest = false;
                    break;
                }
            }
            answer.add(isGreatest);
        }
        return answer;
    }
}
