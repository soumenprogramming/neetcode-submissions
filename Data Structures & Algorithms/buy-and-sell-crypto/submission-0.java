class Solution {
    public int maxProfit(int[] prices) {
        
        int profit=0;
        int minValue=Integer.MAX_VALUE;
        for(int n:prices){
             minValue=(Math.min(n,minValue));
            profit=Math.max(profit,n-minValue);
        }

        return profit;
    }
}
