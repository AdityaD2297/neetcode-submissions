class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0, left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()) {
            if(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                count = Math.max(count, set.size());
                right++;
            }
        }
        return count;
    }
}
