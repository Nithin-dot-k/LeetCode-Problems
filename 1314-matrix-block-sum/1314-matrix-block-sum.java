class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int [][]res=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                int sum=0;
                for(int r=Math.max(i-k,0);r<=(i+k) && r<mat.length;r++){
                    for(int c=Math.max(j-k,0);c<=(j+k) && c<mat[i].length;c++){
                        sum+=mat[r][c];
                    }
                }
                res[i][j]=sum;
            }
        }
        return res;
    }
}