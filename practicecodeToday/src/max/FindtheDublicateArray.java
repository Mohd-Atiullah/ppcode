package max;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class FindtheDublicateArray {
	

	
	    public static void findDuplicates(List<Integer> list) {
	        if (list != null && !list.isEmpty()) {
	            Set<Integer> uniques = new HashSet<>();
	            Set<Integer> duplicates = new HashSet<>();

	            for (Integer element : list) {
	                if (!uniques.add(element)) {
	                    duplicates.add(element);
	                }
	            }

	            System.out.println("Uniques: " + uniques);
	            System.out.println("Duplicates: " + duplicates);
	        } else {
	            System.out.println("LIST IS INVALID");
	        }
	    }

	    public static void main(String[] args) {
	        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 7, 9);
	        findDuplicates(numbers);
	    }
	

}
