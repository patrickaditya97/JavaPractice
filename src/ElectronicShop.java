public class ElectronicShop {
	public static void main(String[] args) {
		int budget = 5;
		int[] keyboard = {5};
		int[] drives = {4};
		int price = 0;
		for(int i = 0; i<keyboard.length; i++){
			for(int j = 0; j < drives.length; j++){
				int cost = keyboard[i] + drives[j];
				if(cost > price && cost <= budget) System.out.println(cost);
			}
		}
	}
}
