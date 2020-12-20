public class ValidParanthesesString {
	public static void main(String[] args) {
		String validParenthesesString = "((((((((1))))))))";
		int stringSize = validParenthesesString.length();
		int depth = 0;
		int maxDepth = 0;
		for(int i = 0; i<stringSize; i++){
			char character = validParenthesesString.charAt(i);
			if (character == '(') {
				depth++;
			} else if (character == ')') {
				depth--;
			}

			if (depth>maxDepth) {
				maxDepth = depth;
			}
		}
		System.out.println(maxDepth);
	}
}
