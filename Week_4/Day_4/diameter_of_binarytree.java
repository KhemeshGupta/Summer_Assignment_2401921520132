class Solution {
    private int heighte(TreeNode root){
        if(root==null){
            return 0;
        }
        int lefthei=heighte(root.left);
        int righthei=heighte(root.right);
        return Math.max(lefthei,righthei)+1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)){
            return 0;
        }
        int leftdiam=diameterOfBinaryTree(root.left);
        int rightdiam=diameterOfBinaryTree(root.right);
        int heightdiam=heighte(root.left)+heighte(root.right);
        return Math.max(heightdiam,Math.max(leftdiam,rightdiam));
    }
}