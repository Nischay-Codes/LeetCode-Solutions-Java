package BruteForce.BurteForce.Easy;

public class P1470_ShuffletheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2*n];
        for (int i = 0; i < n; i++) {
            answer[2*i] = nums[i];
            answer[2*i+1] = nums[i+n];
        }
        return answer;
    }
}
