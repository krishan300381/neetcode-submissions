class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int best = prices[0];
        for(int i=1;i<n;i++){
            //cur=prices[i]-best;
            profit =Math.max(profit,prices[i]-best);
            best=Math.min(best,prices[i]); 
        }
        return profit;
    }
}
