public class AnagramCheck {

	static boolean isAnagram(String a, String b) {
		// Complete the function

		if(a.length() != b.length()) return false;
		a = a.toLowerCase();
		b = b.toLowerCase();
		java.util.Map<Character, Integer> charMap = new java.util.HashMap<>();

		for(int i = 0; i<a.length(); i++){
			if(charMap.containsKey(a.charAt(i))){
				int freq = charMap.get(a.charAt(i));
				charMap.put(a.charAt(i), ++freq);
			} else {
				charMap.put(a.charAt(i), 1);
			}
		}

		for (int i = 0; i < b.length(); i++) {
			if(!charMap.containsKey(b.charAt(i))){
				return false;
			}
			int freq = charMap.get(b.charAt(i));

			if (freq == 0) {
				return false;
			} else {
				charMap.put(b.charAt(i), --freq);
			}

		}

		return true;
	}

	public static void main(String[] args) {

		String str1 = "xyxy";
		String str2 = "xyxy";

		System.out.println(isAnagram(str1, str2));

	}

}
