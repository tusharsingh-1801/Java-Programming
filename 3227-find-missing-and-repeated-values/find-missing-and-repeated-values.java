class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long actualSum =0,actualSqSum=0;
        int n = grid.length;
        long N = (long)(n*n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num = grid[i][j];
                actualSum += num;
                actualSqSum += (long)(num*num);
            }
        }

        long expSum = ((N)*(N+1))/2;
        long expSqSum = ((N)*(N+1)*(2*N+1))/6;

        long sumDiff = actualSum - expSum;
        long sumSqDiff = actualSqSum - expSqSum;

        long sum_AB = sumSqDiff/sumDiff;

        int repeated =(int)((sum_AB + sumDiff)/2);
        int missing = (int)((sum_AB - sumDiff)/2);

        return new int[] {repeated,missing};
    }
    public static void main(String args[]){
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};
        Solution sol = new Solution();
        int[] result = sol.findMissingAndRepeatedValues(grid);
        System.out.println("Number "+result[0]+" is repeated and number "+result[1]+" is missing so answer is ["+result[0]+","+result[1]+"].");
    }
}