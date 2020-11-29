import java.util.ArrayList;
import java.util.List;

public class TryOut {

	public static void main(String[] args) {

		int[] numbs = { 1, 2, 3, 4 };

		for(int i=0; i<numbs.length; i+=2){
			System.out.println(i + " " + (i+1) + " " + numbs[i]);
		}

	}

}
