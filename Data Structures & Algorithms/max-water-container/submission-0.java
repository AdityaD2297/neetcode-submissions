class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1, maxArea = 0;
        while(l < r) {
            int h = Math.min(heights[l], heights[r]); 
            int w = r - l;
            maxArea = Math.max(maxArea, h * w);
            if(heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }

        return maxArea;
    }
}
