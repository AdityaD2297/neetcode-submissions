class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        List<Integer> res = new ArrayList<>();
        int lb = 0, rb = nums[0].length-1, tb = 0, bb = nums.length-1;
        while(lb <= rb && tb <= bb) {
            for(int i = lb; i <= rb; i++) {
                res.add(nums[tb][i]);
            }
            tb++;

            for(int i = tb; i <= bb; i++) {
                res.add(nums[i][rb]);
            }
            rb--;
            
            if(tb <= bb) {
                for(int i = rb; i >= lb; i--) {
                    res.add(nums[bb][i]);
                }
                bb--;
            }

            if(lb <= rb) {
                for(int i = bb; i >= tb; i--) {
                    res.add(nums[i][lb]);
                }
                lb++;
            }
        }

        return res;
    }
}
