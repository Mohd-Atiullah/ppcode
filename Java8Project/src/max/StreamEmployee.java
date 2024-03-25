package max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployee {
	public static void main(String[] args) {
		
		// intput 5,6,2,5,6,2,5,6,2
		//find the
		 
		List<Integer> res = Arrays.asList(5,6,2,5,6,2,5,6,2);
		List<Integer> res22 = res.stream().sorted(Comparator.reverseOrder())
				.distinct().collect(Collectors.toList());
		
System.out.println(res22.get(1));

//array list size 100


		/*	List<Integer> ress = res.stream().filter(e->e>4 &&e<6
				
				
				).collect(Collectors.toList());
		System.out.println(ress);*/
		
		
		
		
	}

}
