import java.util.Arrays;

public class BreakingRecords {
	static int[] breakingRecords(int[] scores) {
		int[] resultArray = new int[2];

		int sizeOfArray = scores.length;
		int minimum = scores[0];
		int maximum = scores[0];


		for(int i=1; i<sizeOfArray; i++){

			if (scores[i] > maximum) {
				resultArray[0]++;
				maximum = scores[i];
			} else if(scores[i] < minimum){
				resultArray[1]++;
				minimum = scores[i];
			}

		}

		return resultArray;
	}

	public static void main(String[] args) {
		int[] scoresArray = {10, 5, 20, 20, 4, 5, 2, 25, 1};

		int[] result = breakingRecords(scoresArray);
		System.out.println(Arrays.toString(result));
	}
}
