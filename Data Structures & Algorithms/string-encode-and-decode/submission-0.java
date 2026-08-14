class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for(String s: strs) {
            sizes.add(s.length());
        }
        for(int size: sizes) {
            sb.append(size).append(',');
        }
        sb.append('#');
        for(String str: strs) {
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length() < 1) return new ArrayList<>();
        
        List<String> strs = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

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
            strs.add(str.substring(i, i + size));
            i+=size;
        }
        return strs;
    }
}
