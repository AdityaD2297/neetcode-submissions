class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, maxLen = 0;
        Set<Character> set =  new HashSet<>();
        while(j < s.length()) {
            if(set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            } else {
                set.add(s.charAt(j));
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            }
        }

        return maxLen;
    }
}
