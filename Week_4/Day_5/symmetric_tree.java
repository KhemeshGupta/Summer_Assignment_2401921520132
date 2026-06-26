class Solution {
    boolean flag=true;
    private void check(TreeNode left,TreeNode right){
        if(flag==false) return;
        if(left==null && right==null) return;
        if(left==null || right==null || left.val!=right.val){
            flag=false;
            return;
        }
        check(left.left,right.right);
        check(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        check(root.left,root.right);
        return flag;
    }
}