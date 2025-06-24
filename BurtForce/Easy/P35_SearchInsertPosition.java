package BrutForce.BurtForce.Easy;

public class P35_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
