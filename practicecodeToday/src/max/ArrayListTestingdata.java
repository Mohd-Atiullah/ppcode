package max;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListTestingdata {
public static void main(String[] args) {
	ArrayList<Integer> numberlist=new ArrayList<>();
	numberlist.add(10);
	numberlist.add(20);
	
List<Integer> numberList2=Arrays.asList(10,15,20,25,30);

//without using Stream 
List<Integer> numberList=new ArrayList<Integer>();
List<Integer> evennumberList=new ArrayList<Integer>();
	/*for(int n:numberlist) {
		if(n%2==0) {
			evennumberList.add(n);
		}
		System.out.println(evennumberList);
	}*/
evennumberList=numberList2.stream().filter(n->n%2==0).collect(Collectors.toList());
System.out.println(evennumberList);
	
	
	
}

}
