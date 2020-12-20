class SubrectangleQueries {

	int[][] rectangleQueries = null;
	public SubrectangleQueries(int[][] rectangle) {
		this.rectangleQueries = rectangle;
	}

	public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {

		for (int i = row1; i <= row2; i++) {
			for (int j = col1; j <= col2; j++) {
				rectangleQueries[i][j] = newValue;
			}
		}

	}

	public int getValue(int row, int col) {
		return rectangleQueries[row][col];
	}
}

class Rectangle {
	public static void main(String[] args) {
		int[][] rectangleQueries = {{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}};
		SubrectangleQueries subrectangleQueries = new SubrectangleQueries(rectangleQueries);

		System.out.println(subrectangleQueries.getValue(0, 2));

		subrectangleQueries.updateSubrectangle(0, 0 , 3, 2, 5);
		System.out.println(subrectangleQueries.getValue(0, 2));
		System.out.println(subrectangleQueries.getValue(3, 1));

		subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
		System.out.println(subrectangleQueries.getValue(3, 1));
		System.out.println(subrectangleQueries.getValue(0, 2));
	}
}