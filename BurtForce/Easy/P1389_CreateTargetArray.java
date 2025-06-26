package BruteForce.BurteForce.Easy;

import java.util.ArrayList;
import java.util.List;

public class P1389_CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
