package array;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        var maxProfit = 0;
        var currentMin = Integer.MAX_VALUE;
        for(var buyDate = 0; buyDate < prices.length; buyDate++){
            var buyDatePrice = prices[buyDate];
            if(buyDatePrice < currentMin) {
                currentMin = buyDatePrice;

                var currentMaxprofit = 0;
                for(var sellDate = buyDate + 1; sellDate < prices.length; sellDate++){
                    var profit = prices[sellDate] - prices[buyDate];
                    if(profit > currentMaxprofit){
                        currentMaxprofit = profit;
                    }
                }

                if(currentMaxprofit > maxProfit) {
                    maxProfit = currentMaxprofit;
                }
            }
        }

        return maxProfit;
    }
}
