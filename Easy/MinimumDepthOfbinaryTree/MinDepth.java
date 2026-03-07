package Easy.MinimumDepthOfbinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/*  Leetcode question 111: Minimum Depth of Binary Tree

    Given a binary tree, find its minimum depth.

    The minimum depth is the number of nodes along the shortest path from the root down to the nearest leaf node.

    Note: A leaf is a node with no children.

*/

public class MinDepth {
    public int minDepth(TreeNode root){
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode presentNode = queue.remove();

        while(!queue.isEmpty()){
            if(presentNode.left != null){
                queue.add(presentNode.left);
                depth++;
            }else if(presentNode.left == null){
                return depth;
            }

            if(presentNode.right != null){
                queue.add(presentNode.right);
                depth++;
            }else if(presentNode.right == null){
                return depth;
            }
        }

        return depth;
    }
}
