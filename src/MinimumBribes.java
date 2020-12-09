import java.util.HashMap;
import java.util.Map;

public class MinimumBribes {

	// Complete the minimumBribes function below.
//	static void minimumBribes(int[] positionArray) {
//		int temp;
//		int size = positionArray.length;
//		Map<Integer, Integer> bribersMap = new HashMap<>();
//		for (int i = 0; i < size; i++) {
//			for(int j = 0; j<size - i -1; j++){
//				if(positionArray[j] > positionArray[j+1]){
//					temp = positionArray[j];
//					positionArray[j] = positionArray[j+1];
//					positionArray[j+1] = temp;
//
//					if (bribersMap.containsKey(temp)) {
//						int freq = bribersMap.get(temp);
//						bribersMap.put(temp, ++freq);
//					} else {
//						bribersMap.put(temp, 1);
//					}
//				}
//			}
//		}
//
//		int sum = 0;
//		boolean flag = false;
//		for (int entryKey:bribersMap.keySet()) {
//			// System.out.println(entryKey + " " + bribersMap.get(entryKey));
//			int bribes = bribersMap.get(entryKey);
//			if (bribes > 2) {
//				System.out.println("Too chaotic");
//				flag = true;
//				break;
//			} else {
//				sum += bribes;
//			}
//		}
//
//		if(!flag)
//			System.out.println(sum);
//
//	}

	static void minimumBribes(int[] positionArray){

		int size = positionArray.length;
		int numOfBribes = 0;
		for (int i = 0; i < size; i++) {
			if(positionArray[i] - (i+1) > 2){
				System.out.println("Too chaotic");
				return;
			}

			for (int j = Math.max(0, positionArray[i] - 2); j < i; j++) {
				if(positionArray[i] <  positionArray[j]) numOfBribes++;
			}

		}

		System.out.println(numOfBribes);
	}

	public static void main(String[] args) {

		int[] positions = {1, 2, 5, 3, 7, 8, 6, 4};
		minimumBribes(positions);

	}
}
