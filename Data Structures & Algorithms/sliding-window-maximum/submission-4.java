class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int j = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        int[] res = new int[nums.length - k + 1];
        for(int i = 0; i < nums.length; i++) {
            while(!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);
            if(i >= k - 1){
                res[j++] = nums[deque.peekFirst()];
            }
        }

        return res;
    }
}
