class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }

        int[]freq = new int[26];
        for(char c: s1.toCharArray()){
            freq[c - 'a']++;
        }

        int left = 0, right = 0, required = s1.length();

        while(right < s2.length()) {
            
            if(freq[s2.charAt(right) - 'a'] > 0) {
                required--;
            }
            freq[s2.charAt(right) - 'a']--;
            right++;

            if(right - left > s1.length()) {
                freq[s2.charAt(left) - 'a']++;
                if(freq[s2.charAt(left) - 'a'] > 0) {
                    required++;
                }
                
                left++;
            }

            if(required == 0) {
                return true;
            }
        }

        return false;
    }
}
