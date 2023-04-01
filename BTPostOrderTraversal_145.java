import java.util.ArrayList;
import java.util.List;

public class BTPostOrderTraversal_145 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }}
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>(101);
        postOrder(res,root);
        return res;
    }
    public void postOrder(List<Integer> res, TreeNode root){
        if(root==null) return;
        postOrder(res,root.left);
        postOrder(res,root.right);
        res.add(root.val);
    }
}
