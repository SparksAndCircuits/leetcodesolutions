package Easy.BalancedTrees;


/*  Leetcode question 110: Balanced Binary Tree

    Given a binary tree, determine if it is height-balanced.

*/

public class IsBalanced {
    public boolean isBalanced(TreeNode root){
        return dfs(root)[0] == 1;
    }

    private int[] dfs(TreeNode node){
        if(node == null){
            return new int[]{1,0};
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int balanced = (left[0] == 1 && right[0] == 1 && Math.abs(left[1] - right[1]) <= 1) ? 1 : 0;

        return new int[]{balanced, 1 + Math.max(left[1],right[1])};
    }
}
