class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length-1;
        int m = 0;
        int top = 0, bottom = matrix.length - 1;

        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;

            if (target > matrix[mid][n]) {
                top = mid + 1;
            } else if (target < matrix[mid][0]) {
                bottom = mid - 1;
            } else {
                m = mid;
                break;
            }
        }

        int l = 0, r = matrix[m].length-1;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(target == matrix[m][mid]) return true;
            else if(target > matrix[m][mid]) l = mid + 1;
            else r = mid - 1;
        } 

        return false;
    }
}
