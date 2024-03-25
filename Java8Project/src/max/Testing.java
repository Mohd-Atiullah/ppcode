package max;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Testing {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(71,18,42,2,20);
	Map<Boolean, List<Integer>> oddEvenNumbersMap=list.stream().collect(Collectors.partitioningBy(i->i%2==0));

	Set<Entry<Boolean, List<Integer>>> entryset = oddEvenNumbersMap.entrySet();
	for(Entry<Boolean,List<Integer>>  entryss:entryset) {
		if(entryss.getKey()) {
			System.out.println("Even Number");
		}else {
			System.out.println("odd Number");
		}
		
		System.out.println(".....");
		List<Integer> lists = entryss.getValue();
		for( int i: lists) 
		{
			System.out.println(i);
		}
	}


}
}
