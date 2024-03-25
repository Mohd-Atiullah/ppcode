package max;
import java.util.ArrayList;
import java.util.HashSet;
public class FindDublicateArray {
	

	

	    public static void main(String[] args) {
	        int[] zipcodes = {12345, 56789, 12345, 98765, 56789, 54321};
	        ArrayList<Integer> duplicates = findDuplicates(zipcodes);

	        if (!duplicates.isEmpty()) {
	            System.out.println("Duplicate zip codes: " + duplicates);
	        } else {
	            System.out.println("No duplicates found in the zip code list.");
	        }
	    }
	    public static ArrayList<Integer> findDuplicates(final int[] zipcodelist) {
	        HashSet<Integer> uniqueSet = new HashSet<>();
	        ArrayList<Integer> duplicatesList = new ArrayList<>();

	        for (int element : zipcodelist) {
	            if (!uniqueSet.add(element)) {
	                // If add returns false, it means the element is already in the set (duplicate)
	                duplicatesList.add(element);
	            }
	        }

	        return duplicatesList;
	    }
	

}
