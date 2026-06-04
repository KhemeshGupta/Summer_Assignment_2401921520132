class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        if(row*col!=(r*c)) return mat;
        int[] newmat=new int[row*col];
        int k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                newmat[k]=mat[i][j];
                k++;
            }
        }
        int l=0;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=newmat[l];
                l++;
            }
        }
        return res;
    }
}