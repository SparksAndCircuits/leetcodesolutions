package Easy;

/*  Leetcode question 88: Merge Sorted Array

    You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing teh number of elements in num1 and num2 respectively.

    Merge num1 and num2 into a single array sorted in non-decreasing order.

    The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, num1 has a length of m + n, where the first m elements denote teh elements that should be merged, and the last n elemets are set to 0 and should be ignored. Nums 2 has a length of n.

*/

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int last = m + n - 1;

        while(m > 0 && n > 0){
            if(nums1[m - 1] > nums2[n - 1]){
                nums1[last] = nums1[ m - 1];
                m--;
            }else{
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }

        while(n > 0){
            nums1[last] = nums2[n - 1];
            n--;
            last--;
        }
    }
}
