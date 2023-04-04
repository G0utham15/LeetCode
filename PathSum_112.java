public class PathSum_112 {
    static class TreeNode {
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return preOrder(root, targetSum);
    }
    public boolean preOrder(TreeNode temp,int targetSum) {
        if(isLeafNode(temp)){
            return temp.val==targetSum;
        }
        if(temp.left!=null&&temp.right!=null)
            return preOrder(temp.left, temp.val,targetSum)||preOrder(temp.right,temp.val,targetSum);
        else if(temp.left==null) {
            return preOrder(temp.right, temp.val, targetSum);
        }else{
            return preOrder(temp.left,temp.val,targetSum);
        }
    }
    public boolean preOrder(TreeNode temp, int sum, int targetSum){

        if(temp==null) {
            return false;
        }
        if(temp.left==null&&temp.right==null){
            return (sum+temp.val)==targetSum;
        }
        //if(sum>=targetSum) return false;
        sum+=temp.val;
        return preOrder(temp.left, sum,targetSum)||preOrder(temp.right,sum,targetSum);
    }
    public boolean isLeafNode(TreeNode temp){
        return temp.left==null&&temp.right==null;
    }
}
