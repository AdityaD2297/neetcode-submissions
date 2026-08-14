class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Set<Integer> set = new HashSet<>();
        int prod = 1, countZero = 0;
        for(int i: nums) {
            set.add(i);
            if(i != 0) 
                prod *= i;
            else 
                countZero++;
        }
        System.out.println(countZero);
        if(countZero > 1) 
            return new int[nums.length];

        System.out.println(prod);
        if(set.contains(0)) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0 ) {
                    res[i] = prod ;
                } else {
                    res[i] = 0;
                }
            }
        }

        if(!set.contains(0)) {
            for(int i = 0; i < nums.length; i++) {
                res[i] = prod / nums[i];
            }
        }

        return res;
    }
}  
