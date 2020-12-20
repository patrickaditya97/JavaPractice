import java.util.ArrayList;
import java.util.List;

public class SubArrayDivision {

	static int birthday(List<Integer> s, int d, int m) {
		int count = 0;

		int sizeOfArray = s.size();
		for (int i = 0; i <= sizeOfArray-m; i++) {
			int sum = 0;
			for (int j = i; j < i+m; j++) {
				sum += s.get(j);
				System.out.println(s.get(j) + " : " + i + " " + j + " " + sum);
				if (sum == d && j == i+m-1) {
					count++;
				}
			}
		}


		return count;
	}

	public static void main(String[] args) {

		int m = 2;
		int d = 3;

		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(6);
		System.out.println(birthday(arrayList, d, m));

	}
}
