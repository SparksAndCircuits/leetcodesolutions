package Easy.ConvertedSortedArraytoBinarySearchTree;

/* LeetCode question 108: Convert sorted array to binary search tree

    Given an integer array nums where the element are sorted in ascending order, convert it to a height balanced binary search tree.

*/

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums){
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int l, int r){
        if(l > r){
            return null;
        }

        int m = (l + r) / 2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = helper(nums, l, m - 1);
        root.right = helper(nums, m + 1, r);
        return root;
    }
}
