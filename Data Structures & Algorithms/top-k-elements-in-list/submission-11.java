class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] list = new List[nums.length+1];

        for(int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            list[entry.getValue()].add(entry.getKey());
        }
        
        int []res = new int[k];
        int index = 0;
        for(int i = list.length-1; i > 0 && index < k; i--) {
            for(int n: list[i]) {
                res[index++] = n;
                if(index == k) {
                    return res;
                } 
            }
        }
        return res;
    }
}
