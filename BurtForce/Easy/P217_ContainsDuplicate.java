package BrutForce.NotUploaded.Easy;

import java.util.HashSet;

public class P217_ContainsDuplicate {
    //Given an integer array nums, return true if any value appears at least twice in the array, and false if every element is distinct.
    public boolean containsDuplicate(int[] nums) {
        boolean containsDuplicate;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)){
                set.add(num);
            }
            else return true;
        }
        return false;
    }
}
