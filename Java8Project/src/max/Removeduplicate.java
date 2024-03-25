package max;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Removeduplicate {
public static void main(String[] args) {


	List<String> list =
	Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
	List<String> unique = list.stream().distinct().collect(Collectors.toList());   		  
	unique.forEach(e->System.out.println(e));

}
}
