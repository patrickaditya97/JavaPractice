public class RichestCustomerWealth {
	public static void main(String[] args) {
		int[][] wealthArray = {{1, 2, 3}, {3, 2, 1}};
		int size = wealthArray.length;
		int sum = 0;
		for (int i = 0; i < size; i++) {
			int firstCustomerWealthSize = wealthArray[i].length;
			int sumOfWealthOfOne = 0;
			for (int j = 0; j < firstCustomerWealthSize; j++) {
				sumOfWealthOfOne += wealthArray[i][j];
			}

			if (sumOfWealthOfOne > sum) {
				sum = sumOfWealthOfOne;
			}
		}

		System.out.print(sum);

	}
}
