package max;

public class ArrayMaxMin {
public static void main(String[] args) {
	int items[]= {2,3,46,7,1};
	int max = items[0];
	int min = items[0];

	for (int i = 1; i < items.length; i++) {
	  if (items[i] > max) {
	    max = items[i];
	  }
	  else if (items[i] < min) {
	    min = items[i];
	  }
	}

	System.out.println(max);	//100
	System.out.println(min); 
}
}
