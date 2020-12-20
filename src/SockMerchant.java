import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
	public static void main(String[] args) {
		Map<Integer, Integer> sockMap = new HashMap<>();
		int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		for(int i = 0; i<socks.length; i++){
			int sock = socks[i];
			if(sockMap.containsKey(sock)) {
				int frequency = sockMap.get(sock)+1;
				sockMap.put(sock, frequency);
			} else {
				sockMap.put(sock, 1);
			}
		}
		for(int sockType: sockMap.keySet()){
			System.out.println(sockType + " " + sockMap.get(sockType)/2);
		}
	}
}
