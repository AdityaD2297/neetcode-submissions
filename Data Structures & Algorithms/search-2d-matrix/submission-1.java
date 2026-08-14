class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length-1;
        int m = 0;
        for(int i = 0; i < matrix.length; i++) {
            if(target <= matrix[i][n]) {
                m = i;
                break;
            } 
        }

        int l = 0, r = matrix[m].length-1;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(target == matrix[m][mid]) return true;
            else if(target > matrix[m][mid]) l++;
            else r--;
        } 

        return false;
    }
}
