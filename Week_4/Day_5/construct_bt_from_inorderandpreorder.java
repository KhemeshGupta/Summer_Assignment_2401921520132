class Solution {
    int preIndx;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        preIndx=0;
        return build(inorder,preorder,0,inorder.length-1);
    }
    private TreeNode build(int[] inorder,int[] preorder,int start,int end){
        if(start>end) return null;
        int rootVal=preorder[preIndx++];
        TreeNode newNode=new TreeNode(rootVal);
        int indx=map.get(rootVal);
        newNode.left=build(inorder,preorder,start,indx-1);
        newNode.right=build(inorder,preorder,indx+1,end);
        return newNode;
    }
}