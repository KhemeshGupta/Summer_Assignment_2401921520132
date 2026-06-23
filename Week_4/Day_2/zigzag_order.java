class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> preans=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                preans.add(curr.val);       
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            if(level%2==1){
                Collections.reverse(preans);
            }
            level++;
            ans.add(preans);
        }
        return ans;
    }
}