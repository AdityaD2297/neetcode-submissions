class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";

        int[] freq = new int[126];
        int[] window = new int[126];

        for(char c: t.toCharArray()) freq[c]++;

        int i = 0, j = 0;
        int start = 0, have = 0;
        int minLen = Integer.MAX_VALUE;
        int req = t.length();

        while(j < s.length()) {
            char cr = s.charAt(j);
            window[cr]++;
            if(freq[cr] > 0 && window[cr] <= freq[cr]) have++;
            j++;

            while(req == have) {
                
                if(j - i < minLen) {
                    minLen = j - i;
                    start = i;
                }

                char cl = s.charAt(i);
                window[cl]--;
                if(freq[cl] > 0 && window[cl] < freq[cl]) have--;
                i++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
