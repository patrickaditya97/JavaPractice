import java.util.Arrays;

public class ArrayManipulation {

	static long arrayManipulation(int n, int[][] queries) {
		long[] finalOutputArray = new long[n+1];
		int size = queries.length;

		for (int i = 0; i < size; i++) {
			int lowerLimit = queries[i][0];
			int upperLimit = queries[i][1];
			int summand = queries[i][2];

			for (int j = lowerLimit; j <= upperLimit; j++) {
				finalOutputArray[j]+= summand;
			}

		}

		Arrays.sort(finalOutputArray);
//		System.out.println(Arrays.toString(finalOutputArray));

		int lastIndex = finalOutputArray.length-1;
		return finalOutputArray[lastIndex];
	}

	public static void main(String[] args){

		int[][] queryArray = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
		System.out.println(arrayManipulation(10, queryArray));

	}
}
