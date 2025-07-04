package BrutForce.BurtForce.Easy;

public class P121_MaxiumProfit {
    public int maxProfit(int[] prices){
        int maxProfit = 0;


        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
