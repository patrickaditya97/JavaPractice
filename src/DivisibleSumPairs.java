public class DivisibleSumPairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;

		for (int i=0; i<n-1; i++){
			System.out.println(i);
			for (int j = i+1; j < n; j++) {
				System.out.print((ar[i] + ar[j]) + " ");
				if ((ar[i] + ar[j]) % k == 0) {
					count++;
				}
			}
			System.out.println();
		}

		return count;
	}

	public static void main(String[] args) {
		int[] array = {1, 3, 2, 6, 1, 2};
		int divisibility = 3;
		System.out.println(divisibleSumPairs(array.length, divisibility, array));
	}

}
