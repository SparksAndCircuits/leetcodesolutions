package Easy.BalancedTrees;

import java.util.LinkedList;

import java.util.Queue;

/*  Leetcode question 110: Balanced Binary Tree

    Given a binary tree, determine if it is height-balanced.

*/

public class IsBalanced {
    public boolean isBalanced(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode presentNode = null;
        int left = 0;
        int right = 0;

        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
                left++;
            }

            if(presentNode.right != null){
                right++;
            }
        }

        if(left == right){
            return true;
        }


        return false;
    }
}
