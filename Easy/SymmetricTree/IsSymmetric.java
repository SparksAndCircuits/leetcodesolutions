package Easy.SymmetricTree;
/*  Leetcode question 101: Symmetric Tree

    Given teh root of a binary tree, check whether it is a mirror of it self (i.e., symmetric around its center).
*/
public class IsSymmetric {

    public int value;
    public TreeNode right;
    public TreeNode left;

    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return false;
        }

        if(root.left == root.right){
            return true;
        }

        isSymmetric(root.left);
        isSymmetric(root.right);
        return false;
    }
    
}
