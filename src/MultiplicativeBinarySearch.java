public class MultiplicativeBinarySearch {

	public static int MulBinarySearch(int[] dataArray, int value){
		int i = 0;

		while(i <= dataArray.length-1){
			if(dataArray[i] == value){
				return i;
			}
			if (dataArray[i] < value) {
				i = (2 * i) + 1;
			}
			if (dataArray[i] > value) {
				System.out.println(dataArray[i] + " " + i);
				i = (2 * i) - 2;
			}

			i++;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] someArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 43, 45, 46,46,5, 6, 54,64,67,67,6,7,456789, 98765, 3345135};
		int index = MulBinarySearch(someArray, 13);

		System.out.println(index + " " + (index > -1? someArray[index]: "Not Found"));
	}
}
