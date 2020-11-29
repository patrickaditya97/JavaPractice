public class ShuffleString {

	static String stringShuffler(String str, int[] indices){
		StringBuilder stringBuilder = new StringBuilder(str);

		for (int i = 0; i<indices.length; i++){
			stringBuilder.replace(indices[i], indices[i]+1, Character.toString(str.charAt(i)));
			System.out.println(stringBuilder);
		}

		return stringBuilder.toString();
	}

	public static void main(String[] args) {

		String str = "codeleet";
		int[] indices = {4, 5, 6, 7, 0, 1, 2, 3};

		System.out.println(stringShuffler(str, indices));
	}

}
