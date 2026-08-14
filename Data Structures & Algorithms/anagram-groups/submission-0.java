class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        for(String s: strs) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            String sorted = new String(str);
            strMap.putIfAbsent(sorted, new ArrayList<>());
            strMap.get(sorted).add(s);
        }

        return new ArrayList<>(strMap.values());
    }
}
