package Easy.SymmetricTree;
/*  Leetcode question 101: Symmetric Tree

    Given teh root of a binary tree, check whether it is a mirror of it self (i.e., symmetric around its center).
*/
public class IsSymmetric {

    public int value;
    public TreeNode right;
    public TreeNode left;

    public boolean isSymmetric(TreeNode root){
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }

        if(left == null || right == null){
            return false;
        }

        return (left.val == right.val && dfs(left.left, right.right) && dfs(left.right, right.left));
    }    
}
