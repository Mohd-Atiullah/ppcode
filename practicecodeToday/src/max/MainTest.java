package max;

import java.util.HashMap;
import java.util.Map;

public class MainTest {
public static void main(String[] args) {
	  String st="This is is a A tree";
	  Map<String, Integer> wordMap=countWords(st);
	  System.out.println(wordMap);
}

private static Map<String, Integer> countWords(String stext) {
HashMap<String, Integer> wordMap=new HashMap<>();
String[] words = stext.split(" ");
for( String word:words) {
	if(wordMap.containsKey(word)) {
		wordMap.put(word, wordMap.get(word)+1);
	}else {
		wordMap.put(word, 1);
	}
}
	return wordMap;
}
}
