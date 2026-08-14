class Solution {
    public int maxProfit(int[] prices) {
    int l = 0, r = 1;
    int maxProfit = 0;
    int minPrice = prices[0];
    while(r < prices.length){
        int price = prices[r];
        int profit = price - minPrice;
        maxProfit = Math.max(profit,maxProfit);
        minPrice = Math.min(price, minPrice);
        r++;
        if(profit <= 0) {
            l++;
        }
    }
    return maxProfit;
    }
}
