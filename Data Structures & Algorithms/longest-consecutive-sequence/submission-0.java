class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        for(int v: nums){//v=values
            set.add(v);
        }
        int max=0;
        for(int v:set){
            int count=1;
            while(set.contains(v+1)){
                count++;
                v++;
            }
            if(count >max) max=count;
        }
        return max;
    }
}
