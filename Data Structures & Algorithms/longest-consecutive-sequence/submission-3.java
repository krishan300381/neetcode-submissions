class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int v: nums){
            set.add(v);
        }
        int count=0;
        for(int v: set){
            int innerCount =1;
            while(set.contains(v-1)){
                innerCount++;
                v--;
            }

            if(innerCount > count) 
            count=innerCount;
        }
        return count;
    }
}
