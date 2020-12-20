import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
		int sizeOfNums = nums.length;
		int[] leftProducts = new int[sizeOfNums];
		int[] rightProducts = new int[sizeOfNums];
		int[] resultArray = new int[sizeOfNums];

		leftProducts[0] = 1;
		for(int i=1; i<sizeOfNums; i++){
			leftProducts[i] = leftProducts[i-1] * nums[i-1];
		}

		rightProducts[sizeOfNums-1] = 1;
		for(int i = sizeOfNums-2; i>=0; i--){
			System.out.println(rightProducts[i+1] + " " + nums[i+1]);
			rightProducts[i] = rightProducts[i+1] * nums[i+1];
		}

//		System.out.println(Arrays.toString(leftProducts));
		System.out.println(Arrays.toString(rightProducts));

		return resultArray;
	}

	public static void main(String[] args) {
		int[] elementsArray = {4,5,1,8,2};
		System.out.println(Arrays.toString(elementsArray));
		System.out.println(Arrays.toString(productExceptSelf(elementsArray)));
	}
}
