import java.util.Arrays;

public class JumpSearch {

	public static int jumpSearch(int[] dataArray, int query){
		int sizeOfArray = dataArray.length;
		int position = 0;
		int prevPosition = 0;
		int currentPosition = (int) Math.sqrt(sizeOfArray);

		while(dataArray[currentPosition] <= query && currentPosition < sizeOfArray){
			prevPosition = currentPosition;
			currentPosition += (int) Math.sqrt(sizeOfArray);

			if (currentPosition > sizeOfArray -1) {
				break;
			}
		}

		for(int i = prevPosition; i< currentPosition; i++){
			if (dataArray[i] == query) {
				return i;
			}
		}


		return -1;
	}

	public static void main(String[] args) {
		int[] someArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 43, 45, 46,46,5, 6, 54,64,67,67,6,7,456789, 98765, 3345135};
		Arrays.sort(someArray);
		int index = jumpSearch(someArray, 5);
		System.out.println(someArray[index] + " " + index + " " + Arrays.toString(someArray));
	}

}
