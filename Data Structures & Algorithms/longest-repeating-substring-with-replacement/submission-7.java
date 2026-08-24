class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, maxLen = 0, maxFreq = 0;
        int[] freq = new int[26];
        for(int j = 0; j < s.length(); j++) {
            int index = s.charAt(j) - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);
            int window = j - i + 1;
            if(window - maxFreq > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}