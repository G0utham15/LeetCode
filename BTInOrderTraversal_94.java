import java.util.ArrayList;
import java.util.List;

public class BTInOrderTraversal_94 {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>(101);
        inOrder(res,root);
        return res;
    }

    public void inOrder(List<Integer> res, TreeNode temp){
        if(temp==null){
            return;
        }

        inOrder(res,temp.left);
        res.add(temp.val);
        inOrder(res,temp.right);
    }
}
