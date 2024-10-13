//Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0;
        int minsof=prices[0];
        for(int i=0;i<prices.length;i++){
            minsof=Math.min(prices[i],minsof);
            int prof=prices[i]-minsof;
            maxpro=Math.max(prof,maxpro);
        }
        return maxpro;
    }
}
