

class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int v : nums)
            map.put(v, map.getOrDefault(v, 0) + 1);

        List<Integer> topK = map.entrySet()
                .stream()
                .sorted((a,b) -> b.getValue() - a.getValue())
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();

        int[] res = new int[k];
        for (int i = 0; i < k; i++)
            res[i] = topK.get(i);

        return res;
    }
}
