class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int v: nums){
            set.add(v);
        }
        int max=0;
        for (int v : set) {

            // start only if v is the beginning of sequence
            if (!set.contains(v - 1)) {
                int curr = v;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }
        return max;
    }
}
