package max;

import java.util.HashMap;
import java.util.Map;

public class Testwordcount {

//	\\s+ - splits on one or more white space characters
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String s = "one three    five four   four"
		        + "            two three five     four  four"
		        + "   five five  three    two five";
		
		for (String word : s.split("\\s+")) {
		    map.merge(word, 1, Integer::sum);
		}

		map.entrySet().forEach(System.out::println);
	}
}
