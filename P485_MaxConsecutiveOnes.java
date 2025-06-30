package BruteForce.BurteForce.Easy;

public class P485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int totalCount = 0;
        int count = 0;
        for (int num : nums) {
            if (num!=0){
                count++;
                if (count>totalCount) totalCount = count;
            }
            else count = 0;
        }
        return totalCount;
    }
}
