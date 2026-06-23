class Solution {
    private void swap(TreeNode curr){
        TreeNode temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;
    }
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return null;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            swap(curr);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);          
        }
        return root;
    }
}
