public class BuyAndSellWithCooldown {
	public static void main(String[] args) {
		int[] stockArray = {5, 0, 6, 10, 1, 10, 1, 5, 6, 527, 7, 54, 71, 34, 134, 66, 3144, 531, 53445, 45, 7, 54, 74, 52715};
		int minBuy = Integer.MAX_VALUE;
		int maxProfit = 0;
		boolean sold = false;

		for (int price: stockArray) {

			if(sold){
				sold = false;
				continue;
			}

			if(price < minBuy){
				minBuy = price;
			} else if(price - minBuy > 0){
				maxProfit += price - minBuy;
				sold = true;
				minBuy = Integer.MAX_VALUE;
			}
		}

		System.out.println(maxProfit);
	}
}
