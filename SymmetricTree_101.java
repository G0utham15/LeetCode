import java.util.ArrayDeque;

public class SymmetricTree_101 {
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

    public boolean isSymmetric(TreeNode root) {
        //System.out.println(root.right.val==root.left.val);
        if(root.left!=null&&root.right!=null) {
            System.out.println("Cond 1 Satisfied");
            ArrayDeque<Integer> left=new ArrayDeque<>(), right=new ArrayDeque<>();
            preOrder(root.left, left, true);
            preOrder(root.right,right, false);
            System.out.println(left.toString()+" "+right.toString());
            System.out.println(left.size()+" "+right.size());
            if(right.size()!= left.size()) return false;
            int leftTemp,rightTemp;
            while(!left.isEmpty()&&!right.isEmpty()) {
                leftTemp=left.pop();rightTemp=right.pop();
                System.out.println(leftTemp+" "+rightTemp);
                if(leftTemp!=rightTemp) return false;
            }
            return true;
        }else {
            System.out.println("Cond 2 Satisfied");
            return root.right == root.left;
        }
    }
    public void preOrder(TreeNode root, ArrayDeque<Integer> left, boolean isLeft){
        if(root==null){
            left.push(-101);
            return;
        }
        left.push(root.val);
        if(isLeft) {
            preOrder(root.left, left, isLeft);
            preOrder(root.right, left, isLeft);
        }else{
            preOrder(root.right, left, isLeft);
            preOrder(root.left, left, isLeft);
        }

    }
}

