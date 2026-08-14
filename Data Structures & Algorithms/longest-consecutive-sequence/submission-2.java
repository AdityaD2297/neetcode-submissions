class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set =  new HashSet<>();
        for(int i: nums) {
            set.add(i);
        }

        int res = 0;
        for(int i: set) {
            if(!set.contains(i-1)) {
                int curr = i;
                int longest = 1;
                while(set.contains(curr+1)){
                    longest++;
                    curr++;
                }
                res = Math.max(longest, res);
            }
        }

        return res;
    }
}
