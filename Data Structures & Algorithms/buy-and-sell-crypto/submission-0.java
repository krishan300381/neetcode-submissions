class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int bestBuy=prices[0];
        int profit=0;

        for(int i=1;i<n;i++){
            int thisProfit = prices[i]-bestBuy;
            if(thisProfit > profit) profit = thisProfit;

            if( prices[i] < bestBuy )
             bestBuy=prices[i];
        }
        return profit;

    }
}
