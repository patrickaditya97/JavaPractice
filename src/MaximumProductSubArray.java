public class MaximumProductSubArray {
	//Not Yet completed Please come back soon
	public static int maxProduct(int[] nums) {
		int sizeOfNums = nums.length;
		if(sizeOfNums == 1) return nums[0];

		int maximumProduct = 0;
		int product = 1;
		for(int i = 0; i < sizeOfNums; i++){
			if(nums[i] == 0){
				product = 1;
				continue;
			}

			product *= nums[i];
			if(product > maximumProduct){
				maximumProduct = product;
			}

		}

		return maximumProduct;
	}

	public static void main(String[] args) {
		int[] array = {-6, 2};

		System.out.println(maxProduct(array));
	}
}
