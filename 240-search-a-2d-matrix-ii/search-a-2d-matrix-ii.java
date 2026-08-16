class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = m-1;

        while(start < n && end >= 0){
           

            if(matrix[start][end] == target){
                return true;
            }else if(target < matrix[start][end]){
                end--;
            }else{
                start++;
            }
        }
        return false;

    }
}