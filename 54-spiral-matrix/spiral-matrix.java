class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m =matrix[0].length;

        ArrayList<Integer> ans = new ArrayList<>();

        int top =0,left =0,right=m-1,bottom = n-1;

        while(top <= bottom && left <= right){

            // left to right
            for(int i = left ; i <= right ; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            // top to bottom 
            for(int i = top ;i <= bottom ; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            // right to left
            if(top <= bottom){
                for(int j = right; j >= left ; j--){
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }
            // bottom to top 
            if(left <= right){
                for(int j = bottom ; j >= top ; j--){
                    ans.add(matrix[j][left]);

                }
                left++;
            }
            
        }
        return ans;
    }
}