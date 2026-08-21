class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;

        int[][] result = new int[n][m];

        for(int r = 0;r<n;r++){
            for(int c = 0;c<m;c++){
                int sum = 0;
                int count = 0;

                for(int i = r-1;i<=r+1;i++){
                    for(int j =c-1;j<=c+1;j++){
                        if(i>=0 && i<n && j>=0 && j<m){
                            sum += img[i][j]; 
                            count++;
                        }
                    }
                }
                result[r][c] = sum/count;
            }
        }
        return result;
    }
}