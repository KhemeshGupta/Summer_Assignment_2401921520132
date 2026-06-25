class Solution {
    int maxSum=Integer.MIN_VALUE;
    private int dfs(TreeNode root){
        if(root==null) return 0;
        int leftGain=Math.max(0,dfs(root.left));
        int rightGain=Math.max(0,dfs(root.right));
        maxSum=Math.max(maxSum ,leftGain + rightGain + root.val);
        return root.val+Math.max(leftGain,rightGain);
    }
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
}