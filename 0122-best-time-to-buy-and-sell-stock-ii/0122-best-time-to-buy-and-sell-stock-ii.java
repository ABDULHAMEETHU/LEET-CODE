class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                int current_profit=prices[i]-prices[i-1];
                max_profit=max_profit+current_profit;
            }
        }
        return max_profit;
    }
}