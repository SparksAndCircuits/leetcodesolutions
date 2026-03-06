package Easy.ConvertedSortedArraytoBinarySearchTree;

/* LeetCode question 108: Convert sorted array to binary search tree

    Given an integer array nums where the element are sorted in ascending order, convert it to a height balanced binary search tree.

*/

public class SortedArrayToBST {
    TreeNode head;
    public class BinarySearchTree{
        TreeNode root;
        BinarySearchTree(){
            root = null;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums){
        TreeNode tempNode = head;
        for(int i = 0; i < nums.length; i++){
           if(tempNode == null){
                TreeNode newNode = new TreeNode();
                newNode.val = nums[i];
                return newNode;
           }else if(nums[i] <= tempNode.val){
                tempNode.left = insert(tempNode.left, i);
                return tempNode;
           }else{
            tempNode.right = insert(tempNode.right, i);
            return tempNode;
           }
        }

        void insert(int value){
            insert(root, value);
        }
    }
}
