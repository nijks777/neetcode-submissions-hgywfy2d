class Solution {
    public int maxProfit(int[] prices) {
        int l=0,i=1;
        int profit;
        int max=0;
   while(i<prices.length){
    if(prices[l]<prices[i]){
        profit=prices[i]-prices[l];
        max=Math.max(profit,max);
    }else{
        l=i;
    }
    i++;
   }
   return max;
    }
}
