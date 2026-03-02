package Easy.MaximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/*  Leetcode Question 104. Maximum Depth of a Binary Tree

    Given the root of a binary tree, return its maximum depth.

    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/
public class MaxDepth {
    public int maxDepth(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode presentNode = null;

        while(!queue.isEmpty()){
            presentNode = queue.remove();

            if(presentNode.left != null){
                queue.add(presentNode.left);
            }

            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }

        return presentNode.val;
    }
}
