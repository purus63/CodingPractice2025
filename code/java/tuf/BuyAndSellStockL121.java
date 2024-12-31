package tuf;

public class BuyAndSellStockL121 {
        public int maxProfit(int[] prices) {
            int maxp=prices[prices.length-1];
            int ans=0;
            for(int i=prices.length-2;i>=0;i--)
            {
                int price=prices[i];
                maxp=Math.max(price,maxp);
                ans=Math.max(ans,maxp-price);
            }
            return ans;
        }
}
