import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* Leetcode question 94: Binary Tree Inorder Traversal

    Given the root of a binary tree, return the inorder traversal of its nodes' value.

*/

class InOrderTraversal{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }

        return res;
    }

    public List<Integer> inorderTraversalRecursive(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<integer> res){
        if(root == null){
            return;
        }

        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}