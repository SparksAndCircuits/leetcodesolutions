package Easy.MinimumDepthOfbinaryTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*  Leetcode question 111: Minimum Depth of Binary Tree

    Given a binary tree, find its minimum depth.

    The minimum depth is the number of nodes along the shortest path from the root down to the nearest leaf node.

    Note: A leaf is a node with no children.

*/

public class MinDepth {
    public int minDepth(TreeNode root){
        Stack<int[]> stack = new Stack<>();

        Deque<NodeDepthPair> stacks = new ArrayDeque<>();
        stacks.push(new NodeDepthPair(root, 1));
        int res = 0;

        while(!stack.isEmpty()){
            NodeDepthPair pair = stacks.pop();
            TreeNode node = pair.node;
            int depth = pair.depth;

            if(node != null){
                res = Math.max(res, depth);
                stacks.push(new NodeDepthPair(node.left, depth + 1));
                stacks.push(new NodeDepthPair(node.right, depth + 1));
            }
        }

        return res;
    }

    private static class NodeDepthPair{
        TreeNode node;
        int depth;

        NodeDepthPair(TreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }
}
