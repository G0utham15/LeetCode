import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BTMaximumDepth_104 {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q= new ArrayDeque<>();
        q.add(root);
        TreeNode temp;
        int depth=0;
        int nextLayer=0,currLayer=1;
        while(!q.isEmpty()){
            temp=q.remove();
            currLayer--;
            if(temp.left!=null){
                q.add(temp.left);
                nextLayer++;
            }
            if(temp.right!=null){
                q.add(temp.right);
                nextLayer++;
            }
            if(currLayer==0){
                currLayer=nextLayer;
                nextLayer=0;
                depth++;
            }
        }
        return depth;
    }
}
