import java.util.Arrays;

public class CanPlaceFlowers {

	static boolean canPlaceFlowers(int[] flowerbed, int n) {
		boolean canPlaceFlowers = false;

		if(flowerbed.length == 1){
			if (flowerbed[0] == 0) {
				return true;
			} else if(flowerbed[0] == 1 && n == 0){
				return true;
			} else {
				return false;
			}
		}

		int flowerbedLength = flowerbed.length;
		int i = 0;
		while(i < flowerbedLength && n != 0){

			if (flowerbed[i] == 0) {
				if(i == 0){
					if(flowerbed[i+1] == 0){
						flowerbed[i] = 1;
						n--;
					}
				} else if(i > 0 && i < flowerbedLength-1) {
					if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
						flowerbed[i] = 1;
						n--;
					}
				} else if(i == flowerbedLength-1){
					if(flowerbed[i-1] == 0){
						flowerbed[i] = 1;
						n--;
					}
				}
			}

			i++;
		}

//		System.out.println(n + " " + Arrays.toString(flowerbed));

		if (n == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] flowerArray = {1};
		System.out.println(canPlaceFlowers(flowerArray, 0));
	}

}
