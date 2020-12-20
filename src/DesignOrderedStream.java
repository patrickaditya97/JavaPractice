import java.util.ArrayList;
import java.util.List;

public class DesignOrderedStream {

	public String[] orderedStream = null;
	int ptr;

	public DesignOrderedStream(int n) {
		orderedStream = new String[n];
		ptr = 0;
	}

	public List<String> insert(int id, String value) {
		orderedStream[id-1] = value;

		List<String> streamChunk = new ArrayList<>();
		while(ptr < orderedStream.length && orderedStream[ptr] != null){
			streamChunk.add(orderedStream[ptr]);
			ptr++;
		}

		return streamChunk;
	}

}

class TestClass {
	public static void main(String[] args) {
		DesignOrderedStream designOrderedStream = new DesignOrderedStream(5);

		System.out.println(designOrderedStream.insert(3, "ccccc"));
		System.out.println(designOrderedStream.insert(1, "aaaaa"));
		System.out.println(designOrderedStream.insert(2, "bbbbb"));
		System.out.println(designOrderedStream.insert(5, "eeeee"));
		System.out.println(designOrderedStream.insert(4, "ddddd"));
	}
}
