class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int hasZero=0;
        for(int v:nums){
            if(v!=0)
                product*=v;
            else
                hasZero++;
        }
            if(hasZero>1) product=0;

        for(int i=0;i<nums.length;i++){
            if( nums[i]!=0){
                if(hasZero!=0)
                    nums[i]=0;
                else
                    nums[i]=product/nums[i];
            }else{
                nums[i]=product;
            }
        }
       return nums;
    }  
}
