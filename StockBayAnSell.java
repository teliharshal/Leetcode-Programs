import java.util.Scanner;
public class StockBayAnSell {
    public static void main(String[] args) {
       int[] n = {7,1,5,3,6,4};
       int ans = maxProfit(n);
       System.out.println(ans);
       
    }
        public static int maxProfit(int[] prices) {

            int min = Integer.MAX_VALUE;
            int maxprofit=0;

            for(int i=0;i<prices.length;i++)
            {
                if(prices[i] < min)
                {
                    min = prices[i];
                }
                else if(prices[i] - min > maxprofit)
                {
                    maxprofit = prices[i] - min;
                }

            }
            return maxprofit;
    }
}
