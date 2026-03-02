package Easy.MaximumDepthOfBinaryTree;

import java.util.Stack;

/*  Leetcode Question 104. Maximum Depth of a Binary Tree

    Given the root of a binary tree, return its maximum depth.

    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/
public class MaxDepth {
    public int maxDepth(TreeNode root){
        Stack<Object[]> stack = new Stack<>();
        stack.push(new Object[]{root, 1});
        int res = 0;

        while(!stack.isEmpty()){
            Object[] current = stack.pop();
            TreeNode node = (TreeNode) current[0];
            int depth = (int) current[1];

            if(node != null){
                res = Math.max(res, depth);
                stack.push(new Object[]{node.left, depth + 1});
                stack.push(new Object[]{node.right, depth + 1});
            }
        }

        return res;
    }
}
