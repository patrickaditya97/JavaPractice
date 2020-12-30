import java.util.Arrays;

public class SpiralMatrixII {
	public static int[][] generateMatrix(int n) {
		int[][] spiralMatrix = new int[n][n];

		int row = 0, column = 0, remRows = n, remColumns = n, i;
		int number = 1;

		while(row < remRows && column < remColumns){
			for (i = row; i < n - row; i++) {
				spiralMatrix[row][i] = number++;
			}
			row++;

			for (i = row; i < remRows; i++) {
				spiralMatrix[i][remColumns-1] = number++;
			}
			remColumns--;

			if(row < remRows){
				for(i = remColumns-1; i>=column; i--){
					spiralMatrix[remRows-1][i] = number++;
				}
				remRows--;
			}

			if(column < remColumns){
				for(i = remRows-1; i>=row; i--){
					spiralMatrix[i][column] = number++;
				}
				column++;
			}
		}

		return spiralMatrix;
	}


	public static void main(String[] args) {
		int[][] newMatrix = generateMatrix(3);

		for(int[] arr: newMatrix){
			System.out.println(Arrays.toString(arr));
		}
	}
}
