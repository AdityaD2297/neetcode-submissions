class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(String s: strs) sb.append(s.length()).append(',');
        sb.append('#');
        for(String s: strs) sb.append(s);
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length() < 1) return new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        List<String> res = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#') {
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != ',') {
                sb.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(sb.toString()));
            i++;
        }
        i++;
        for(int size: sizes) {
            res.add(str.substring(i, i+size));
            i+=size;
        }
        return res;
    }
}
