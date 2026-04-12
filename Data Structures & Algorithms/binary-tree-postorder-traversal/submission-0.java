/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> res;
    public List<Integer> postorderTraversal(TreeNode root) {
        res=new ArrayList<>();
        PostOrder(root);
        return res;
        
    }
    private void PostOrder(TreeNode Curr){
        if(Curr==null){
            return;
        }
        PostOrder(Curr.left);
        PostOrder(Curr.right);
        res.add(Curr.val);

    }
}