public class GoalParser {
	public static void main(String[] args) {
		String command = "G()()()()()()()()(al)";

		StringBuilder commandBuilder = new StringBuilder();
		StringBuilder goalBuilder = new StringBuilder();

		for(int i = 0; i < command.length(); i++){
			commandBuilder.append(command.charAt(i));
			String comparator = commandBuilder.toString();
			if(comparator.equals("G") || comparator.equals("()") || comparator.equals("(al)")){
				if(comparator.equals("G")){
					goalBuilder.append("G");
				} else if(comparator.equals("()")){
					goalBuilder.append("o");
				} else if(comparator.equals("(al)")){
					goalBuilder.append("al");
				}
				commandBuilder = new StringBuilder();
			}
		}
	}
}
