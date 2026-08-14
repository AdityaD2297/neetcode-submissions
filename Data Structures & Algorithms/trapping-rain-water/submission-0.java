class Solution {
    public int trap(int[] height) {
        int l = 0,  r = height.length-1, heightL = height[l], heightR = height[r], water = 0;
        while(l < r) {
            if(heightL < heightR){
                l++;
                heightL = Math.max(height[l], heightL);
                water += heightL - height[l];
            } else {
                r--;
                heightR = Math.max(height[r], heightR);
                water += heightR - height[r];
            }
        }

        return water;
    }
}
