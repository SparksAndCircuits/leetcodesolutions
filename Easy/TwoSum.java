package Easy;

import java.util.HashMap;
import java.util.Map;

/*  LeetCode Question 1: Two Sum

    Given an array of Integers nums and an integer target, return indices of the two numsbers such that they add up to target.

    YOu may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.
*/

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
    
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i ,j};
                }
            }
        }

        return new int[]{};
    }   

    public int[] hashmapTwoSum(int[] nums, int target){
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(seen.containsKey(complement)){
                return new int[]{seen.get(complement), i};
            }

            seen.put(nums[i], i);
        }
        return nums;
    }
}