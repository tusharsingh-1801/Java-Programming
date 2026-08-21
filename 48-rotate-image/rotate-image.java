class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] trans = new int[m][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                trans[j][i] = matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            int left =0;
            int right = n-1;
            while(left < right){
                int temp = trans[i][left];
                trans[i][left] = trans[i][right];
                trans[i][right]=temp;
                left++;
                right--;
            }
        } 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = trans[i][j];
            }
        }
    
    }
}