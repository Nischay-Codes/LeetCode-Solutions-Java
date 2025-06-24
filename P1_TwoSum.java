package BrutForce.Uploaded.Easy;

public class P1_TwoSum {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0;i<nums.length;i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] ==target ){
                    return new  int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
}
