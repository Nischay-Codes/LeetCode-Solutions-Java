public class RunningSum1D {
    public int[] runningSums(int[] nums){
        for (int i = 0;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
