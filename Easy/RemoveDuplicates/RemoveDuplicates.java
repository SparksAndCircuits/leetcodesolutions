package Easy.RemoveDuplicates;

/*  Leetcode question 26: Remove duplicates from sorted array

    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-plase such that each unique elements appears only once. The relative order of the elements should be kept the same.

    Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.

    The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

*/
public class RemoveDuplicates {
    ListNode head;
    int size;
    public int removeDuplicates(int[] nums){
        int temp = 0;
        for(int i = 0; i < size; i++){
            if(nums[i] != nums[temp]){
                temp++;
                size--;
            }
        }

        return temp;
    }
}
