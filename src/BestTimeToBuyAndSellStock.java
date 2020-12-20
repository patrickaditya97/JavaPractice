public class BestTimeToBuyAndSellStock {

	static int maxProfitSingle(int[] prices){
		int noOfDays = prices.length;
		int maxProfit = 0;

		for (int i = 0; i < noOfDays-1; i++) {
			int buyPrice = prices[i];

			for (int j = i+1; j < noOfDays; j++) {
				int sellPrice = prices[j];
				int profit = sellPrice - buyPrice;
				if (maxProfit < profit){
					maxProfit = profit;
				}
				System.out.println(sellPrice + " " + buyPrice + " ");
			}
		}

		return maxProfit;
	}

	static int maxProfitMultiple(int[] prices) {
		int maxProfit = 0;

		for (int i = 1; i<prices.length; i++) {
			if(prices[i] > prices[i-1]) {
				maxProfit += prices[i] - prices[i-1];
			}
		}

		return maxProfit;
	}

		public static void main(String[] args) {
		int[] stockData = {7,1,5,0,6,4};
		int maxProfit = maxProfitMultiple(stockData);
		System.out.println(maxProfit);
	}
}
