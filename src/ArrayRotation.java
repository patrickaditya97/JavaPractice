import java.util.Arrays;

public class ArrayRotation {

	public static int[] rotateTheArray(int[] array, int rotations){

		for (int i = 0; i < rotations; i++) {
			int firstElement = array[0];

			for (int j = 1; j < array.length; j++) {
				int index = j;
				array[--index] = array[j];

				if (j == array.length-1) {
					array[array.length-1] = firstElement;
				}
			}

		}
		return array;
	}

//		int[] temp = new int[rotations];
//		System.arraycopy(array, 0, temp, 0, rotations);
//		System.arraycopy(array, rotations, array, 0, array.length-rotations);
//		System.arraycopy(temp, 0, array, array.length-rotations, rotations);

	public static void main(String[] args) {
		int[] integerArray = {1,2,3,4,5};
		int[] rotatedArray = rotateTheArray(integerArray, 5);
		System.out.print(Arrays.toString(rotatedArray));
	}
}
