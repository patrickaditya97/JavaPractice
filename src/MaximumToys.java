import java.util.Arrays;

public class MaximumToys {

	static int maximumToys(int[] prices, int budget){
		Arrays.sort(prices);
		int sum = 0;
		for (int price: prices) {
			if (sum+price <= budget) {
				sum+= price;
			} else {
				break;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] priceArray = {1, 12, 5, 111, 200, 1000, 10};
		System.out.println(maximumToys(priceArray, 50));
	}

}
