class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        addition(root,result);
        return result;
    }
    private void addition(TreeNode root,List<Integer> result){
        if(root==null){
            return;
        }
        addition(root.left,result);
        result.add(root.val);
        addition(root.right,result);
    }
}