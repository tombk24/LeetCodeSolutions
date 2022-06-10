package array;

import java.util.HashMap;

public class TwoSum {

/*

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]

    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

    public int[] twoSumLinear(int[] input, int target) {

        // For each two numbers in the array, we add them
        // If they equal the target, we return the indices.

        // Edge case 1: same element.

        // Time Complexity = O(N^2)

        var twoSum = new int[]{0,0};

        for(int startIndex = 0; startIndex < input.length; startIndex++){
            for(int endIndex = 0; endIndex < input.length; endIndex++){
                if ((input[startIndex] + input[endIndex] == target) && (startIndex != endIndex)){
                    twoSum[0] = startIndex;
                    twoSum[1] = endIndex;
                }
            }
        }

        return twoSum;
    }

    public int[] twoSum(int[] input, int target) {

        // For each element, do target - input[element]
        // if it exists in hashmap, return
        // else, add element as <number, element>

        var numberHashmap = new HashMap<Integer, Integer>();
        for(var index = 0; index < input.length; index++){
            var currentNumber = input[index];
            var searchNumber = target - currentNumber;

            if(numberHashmap.containsKey(searchNumber)){
                return new int[]{index, numberHashmap.get(searchNumber)};
            }

            numberHashmap.put(currentNumber, index);
        }

        return null;
    }
}
