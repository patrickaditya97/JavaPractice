import java.util.Arrays;

public class SubstringComparisons {

	public static String subStringComparison(String str, int k){

		String smallest = "";
		String largest = "";

		String[] strings = new String[str.length()-k+1];
		for (int i = 0; i <= str.length()-k; i++) {
			String subString = str.substring(i, i+k);
			strings[i] = subString;

		}
		System.out.println(Arrays.toString(strings));

		String[] sortedStrings = new String[str.length()-k+1];

		String temp;
		for (int i = 0; i < strings.length-1; i++) {
			boolean flag = false;
			for (int j = 0; j < strings.length-i-1; j++) {
				
				if (strings[j].compareTo(strings[j+1]) > 0) {
					System.out.println(strings[j] + " > " + strings[j+1]);

					temp = strings[j];
					strings[j] = strings[j+1];
					strings[j+1] = temp;

					flag = true;
				}

			}

			if (!flag) {
				break;
			}

		}
		System.out.println(Arrays.toString(strings));


		return smallest + "\n" + largest;

	}

	public static void main(String[] args) {
		System.out.println(subStringComparison("welcometojava", 3));
	}
}
