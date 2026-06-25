class Solution {
    boolean flag=false;
    int ans=0;
    private void search(TreeNode root,int targetSum,int ans){
        if(root==null || flag) return;
        ans+=root.val;
        if (root.left == null && root.right == null) {
            if (ans == targetSum) {
                flag = true;
            }
            return;
        }
        search(root.left,targetSum,ans);
        search(root.right,targetSum,ans);  
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        search(root,targetSum,0);
        return flag;
    }
}