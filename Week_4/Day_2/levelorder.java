class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int coun=q.size();
            List<Integer> presult=new ArrayList<>();
           for(int i=0;i<coun;i++){
               TreeNode node=q.remove();
               presult.add(node.val);
               if(node.left!=null) q.add(node.left);
               if(node.right!=null) q.add(node.right);
           }
           result.add(presult); 
        }
        return result;
    }
}