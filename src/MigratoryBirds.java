import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

	static int birdFrequency(List<Integer> birdList){
		Map<Integer, Integer> birdMap = new HashMap<>();
		int listSize = birdList.size();
		for (int i = 0; i < listSize; i++) {
			int index = birdList.get(i);
			if(birdMap.containsKey(index)){
				int freq = birdMap.get(index)+1;
				birdMap.put(index, freq);
			} else {
				birdMap.put(index, 1);
			}
		}
		
		int frequency = 0;
		int mostFrequentBird = 0;

		for(int frequencyOfBird: birdMap.keySet()){
//			System.out.println(frequencyOfBird + " " + birdMap.get(frequencyOfBird));
			if (birdMap.get(frequencyOfBird) > frequency) {
				mostFrequentBird = frequencyOfBird;
				frequency = birdMap.get(frequencyOfBird);
			}
		}

		return mostFrequentBird;
	}

	static int migratoryBirds(List<Integer> birdList){
		int[] birdFrequencyArray = new int[6];

		int listSize = birdList.size();
		for (int i = 0; i < listSize; i++) {
			int index = birdList.get(i);
			birdFrequencyArray[index]++;
		}

		int frequency = 0;
		int mostFrequentBird = 0;
		int i = 0;
		for(int frequencyOfBird: birdFrequencyArray){
			System.out.println(frequencyOfBird + " " + mostFrequentBird);

			if (frequencyOfBird > frequency) {
				mostFrequentBird = i;
				frequency = frequencyOfBird;
			}

			i++;
		}

		return mostFrequentBird;
	}

	public static void main(String[] args) {
		List<Integer> birdFrequencyList = new ArrayList<>();
		birdFrequencyList.add(1);
		birdFrequencyList.add(1);
		birdFrequencyList.add(2);
		birdFrequencyList.add(4);
		birdFrequencyList.add(4);
		birdFrequencyList.add(4);
		birdFrequencyList.add(5);
		birdFrequencyList.add(3);

		System.out.println(migratoryBirds(birdFrequencyList));
	}

}
