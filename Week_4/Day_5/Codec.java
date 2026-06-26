public class Codec {
    private void preorder(TreeNode root,StringBuilder str){
        if(root==null){
            str.append("null,");
            return;
        }
        str.append(root.val).append(",");
        preorder(root.left,str);
        preorder(root.right,str);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str=new StringBuilder();
        preorder(root,str);
        return str.toString();
    }

    private TreeNode build(Queue<String> q){
        String curr=q.poll();
        if(curr.equals("null")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(curr));
        root.left=build(q);
        root.right=build(q);
        return root;
    } 
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q=new LinkedList<>(Arrays.asList(data.split(",")));
        return build(q);
    }
}