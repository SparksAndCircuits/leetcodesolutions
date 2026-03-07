package Easy.PathSum;


/*  LeetCode question 112: Path Sum

    Given the root of a binary tree and an integer targetSum, return true if the tree has a root to leaf path that adding up all the valuies along the path equals targetSum.

    A leaf is a node with no children.

*/

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum){
        return dfs(root, 0, targetSum);
    }

    private boolean dfs(TreeNode node, int curSum, int targetSum){
        if(node == null){
            return false;
        }

        curSum += node.val;

        if(node.left == null && node.right == null){
            return curSum == targetSum;
        }

        return dfs(node.left, curSum, targetSum) || dfs(node.right, curSum, targetSum);
    }
}
