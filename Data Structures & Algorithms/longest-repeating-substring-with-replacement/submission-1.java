class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, maxLength = 0;
        for(int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);
            int window = right - left + 1;
            if(window - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
