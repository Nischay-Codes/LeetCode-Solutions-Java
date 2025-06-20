package NotUploaded.Easy;

public class P268_MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expentedSum = n*(n+1/2);
        int actualSum = 0;
        for (int num:nums){
            actualSum+=num;
        }
        return expentedSum - actualSum;
    }
}
