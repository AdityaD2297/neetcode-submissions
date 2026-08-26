class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int i = 0, j = 0;
        int[] freq = new int[26];
        for(char c: s1.toCharArray()) {
            freq[c-'a']++;
        }
        int req = s1.length();

        while(j < s2.length()) {
            if(freq[s2.charAt(j) - 'a'] > 0) req--;
            freq[s2.charAt(j)- 'a']--;
            j++;

            if(j - i > s1.length()) {
                freq[s2.charAt(i) - 'a']++;
                if(freq[s2.charAt(i) - 'a'] > 0) req++;
                i++;
            }

            if(req == 0) return true;
        }

        return false;
    }
}
