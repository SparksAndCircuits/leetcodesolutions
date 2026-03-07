package Easy.PathSum;

import java.util.LinkedList;
import java.util.Queue;

/*  LeetCode question 112: Path Sum

    Given the root of a binary tree and an integer targetSum, return true if the tree has a root to leaf path that adding up all the valuies along the path equals targetSum.

    A leaf is a node with no children.

*/

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();

            if(presentNode.val + presentNode.left.val == targetSum){
                queue.add(presentNode.left);
                return true;
            }
        }
        return false;
    }
}
