class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int key:nums){
            map.put(key,map.getOrDefault(key,0) +1);
        }

        ArrayList<Integer> [] bucket = new ArrayList [nums.length+1];

        for(int key:map.keySet()){
            int freq = map.get(key);
            if(bucket[freq]==null){
                bucket[freq] =new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int ans[]=new int[k];
        int count=0;

        for(int i=bucket.length-1;i>0;i--){
            if(bucket[i] != null ){
                for(int v:bucket[i]){
                    ans[count]=v;
                    count++;
                }
            }
            if (count >=k) return ans;
        }
        return ans;
        
    }
}
