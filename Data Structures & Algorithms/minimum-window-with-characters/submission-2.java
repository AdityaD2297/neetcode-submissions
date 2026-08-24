class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        int[] freq = new int[126];
        int[] window = new int[126];
        for(char c: t.toCharArray()) freq[c]++;
        int i = 0, j = 0;
        int req = t.length(), have = 0;    
        int start = 0, minLen = Integer.MAX_VALUE;
        while(j < s.length()) {
            window[s.charAt(j)]++;
            if(freq[s.charAt(j)] > 0 && window[s.charAt(j)] <= freq[s.charAt(j)]) have++;
            j++;

            while(req == have) {
                if(j - i < minLen) {
                    start = i;
                    minLen = j - i;
                }
                window[s.charAt(i)]--;
                if(freq[s.charAt(i)] > 0 && window[s.charAt(i)] < freq[s.charAt(i)]) have--;
                i++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, minLen + start);
    }
}
