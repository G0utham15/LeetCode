import java.util.ArrayDeque;

public class InvertBinaryTree_226 {
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        preOrder(root);
        return root;
    }
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        preOrder(root.left);
        preOrder(root.right);
    }
}
