class Solution {
    List<Integer> result=new ArrayList<>();
    private void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        List<Integer> ans=new ArrayList<>(result);
        for(int i=1;i<ans.size();i++){
            if(result.get(i)<=ans.get(i-1)){
                return false;
            }
        }
        return true;
    }
}