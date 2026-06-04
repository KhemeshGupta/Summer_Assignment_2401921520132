class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=0;int rowe=matrix.length-1;int cols=0;int cole=matrix[0].length-1;
        List<Integer> ans=new ArrayList<>();
        while(rows<=rowe && cols<=cole){
            for(int i=cols;i<=cole;i++){
                ans.add(matrix[rows][i]);
            }
            rows=rows+1;
            for(int i=rows;i<=rowe;i++){
                ans.add(matrix[i][cole]);
            }
            cole=cole-1;
            if(rows<=rowe){
                for(int i=cole;i>=cols;i--){
                    ans.add(matrix[rowe][i]);
                }
            }
            rowe=rowe-1;
            if(cols<=cole){
                for(int i=rowe;i>=rows;i--){
                    ans.add(matrix[i][cols]);
                }
            }
            cols=cols+1;
        }
        return ans;
    }
}