package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicates {

//    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//    Example 1:
//
//    Input: nums = [1,2,3,1]
//    Output: true

    public boolean containsDuplicateIteration1(int[] nums) {

        // Scored faster than 13%.
        Arrays.sort(nums);
        if(nums.length == 1){
            return false;
        }
        var containsDuplicates = false;
        for(var index = 0; index < nums.length - 1; index++){
            if(nums[index] == nums[index + 1]) {
                containsDuplicates = true;
            }
        }

        return containsDuplicates;
    }

    public boolean containsDuplicate(int[] nums) {
        // Scored faster than 76%.
        var numHashmap = new HashSet<>();
        for(var number: nums){
            if(numHashmap.contains(number)){
                return true;
            }
            numHashmap.add(number);
        }
        return false;
    }

}
