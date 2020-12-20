public class KthFactor {
	static int kthFactor(int n, int k) {
		int count = 0;

		for(int i=1; i<=n; i++){
			if(n % i == 0) count++;

			System.out.println(i + " " + count);
			if(count == k){
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int number = 1000;
		int factorAt = 100;

		System.out.println(kthFactor(number, factorAt));
	}

}
