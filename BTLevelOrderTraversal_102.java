import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BTLevelOrderTraversal_102 {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>() {};

        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        List<Integer> LevelElem=new ArrayList<>();

        q.add(root);
        int nextLayer=0,currLayer=1;
        TreeNode temp;
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
            LevelElem.add(temp.val);
            if(currLayer==0){
                currLayer=nextLayer;
                nextLayer=0;
                res.add(LevelElem);
                LevelElem=new ArrayList<>();
            }
        }
        return res;
    }
}
