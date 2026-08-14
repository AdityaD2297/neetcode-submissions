class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,  List<String>> map = new HashMap<>();
        for(String s: strs) {
            int[] n = new int[26];
            for(char c: s.toCharArray()) {
                n[c-'a']++;
            }
            String str = Arrays.toString(n);
            map.putIfAbsent(str, new ArrayList<>());
            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }
}