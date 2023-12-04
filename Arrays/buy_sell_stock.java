public class buy_sell_stock{
    public static void main(String args[]){
        int stockPrice[]  = {7,1,5,3,6,4};
        System.out.print(buyAndSellStocks(stockPrice));
    }
    static int buyAndSellStocks(int stockPrice[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i<stockPrice.length;i++){
            if(buyPrice < stockPrice[i]){
                int profit = stockPrice[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice = stockPrice[i];
            }
        }
        return maxProfit;
    }
}