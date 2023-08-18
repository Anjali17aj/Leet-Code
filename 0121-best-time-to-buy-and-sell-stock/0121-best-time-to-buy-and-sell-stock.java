class Solution {
    public int maxProfit(int[] prices) {

        int buyStockPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<prices.length; i++){
            if(buyStockPrice < prices[i]){ //buyStockPriceis buying priceo of yesterday and prices[i]is selling price of today. Here we get Profit. 
                int Profit = prices[i]- buyStockPrice; //todays's profit.
                maxProfit=Math.max(maxProfit, Profit); //maximum profit till today is maxProfit , Today's maximum profit calculated is Profit.
            } else {
                buyStockPrice = prices[i]; //Condition: if today's selling price is less than the buying price of yesterday then its better to buy a stock rather than selling it so that in future price will be high so we will be able to sell it then only we will make profit. don't sell it today.
            }
        }
        return maxProfit;

    }
        
    }
