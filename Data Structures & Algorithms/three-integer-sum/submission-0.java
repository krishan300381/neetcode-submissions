class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> list =new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++) {
            int l=i+1;
            int r=n-1;

            if( i>0 && nums[i]==nums[i-1]) continue;

            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];

                if(sum==0){
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    list.add(triplet);

                    //skip duplicates
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                }
                else if(sum > 0)
                r--;
                else
                l++;

            }

            
        }
        return list;
    }
}
