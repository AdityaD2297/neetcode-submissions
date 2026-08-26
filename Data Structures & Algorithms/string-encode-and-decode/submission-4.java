class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            sb.append(s.length()).append(",");
        }
        sb.append("#");
        for(String s: strs) {
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String s) {
        if(s.length() < 1) return new ArrayList<>();
        List<Integer> len = new ArrayList<>();
        List<String> res = new ArrayList<>();
        int i = 0;
        while(s.charAt(i) != '#'){
            StringBuilder sb = new StringBuilder();
            while(s.charAt(i) != ','){
                sb.append(s.charAt(i));
                i++;
            }
            len.add(Integer.parseInt(sb.toString()));
            i++;
        }
        i++;
        for(int j: len) {
            res.add(s.substring(i, j + i));
            i+=j;
        }
        return res;
    }
}
