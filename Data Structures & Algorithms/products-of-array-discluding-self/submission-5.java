class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, countZero=0;
        for(int i: nums) {
            if(i != 0) {
                prod *= i;
            } else {
                countZero++;
            }
        }

        if(countZero > 1) {
            return new int[nums.length];
        }

        if(countZero == 1) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0 ) {
                    nums[i] = prod ;
                } else {
                    nums[i] = 0;
                }
            }
        }

        if(countZero == 0) {
            for(int i = 0; i < nums.length; i++) {
                nums[i] = prod / nums[i];
            }
        }

        return nums;
    }
}  
