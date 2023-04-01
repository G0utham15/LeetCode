import java.util.ArrayList;
import java.util.List;

public class BTPreOrderTraversal_144 {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>(101);
        preOrder(res,root);
        return res;
    }

    public void preOrder(List<Integer> res, TreeNode temp){
        if(temp==null){
            return;
        }
        res.add(temp.val);
        preOrder(res,temp.left);
        preOrder(res,temp.right);
    }
}
