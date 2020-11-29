import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int[] data, int item){
		int size = data.length;
		int L = 0;
		int R = size-1;
		System.out.println(Arrays.toString(data));
		while(size-- >= 0){

			if(L > R) {
				return -1;
			} else {
				int midIndex = (L + R) / 2;
					System.out.println("midIndex: " + midIndex);
					System.out.println(data[midIndex]);

				if(data[midIndex] < item){
					L = midIndex + 1;
				} else if (data[midIndex] > item) {
					R = midIndex - 1;
				} else if (data[midIndex] == item){

					return midIndex;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] data = {};
		Arrays.sort(data);
		int result = binarySearch(data, 24);
		if (result == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found" + result);
		}

	}
}
