class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] freq = new int[26];
        for(char c: s1.toCharArray()) {
            freq[c - 'a']++;
        }
        int i = 0, j = 0, req = s1.length();
        while(j < s2.length()) {
            int cr = s2.charAt(j) - 'a';
            if(freq[cr] > 0) {
                req--;
            }
            freq[cr]--;
            j++;

            if(j - i > s1.length()) {
                int cl = s2.charAt(i) - 'a';
                freq[cl]++;
                if(freq[cl] > 0) req++;
                i++;
            }

            if(req == 0) return true;
        }

        return false;
    }
}
