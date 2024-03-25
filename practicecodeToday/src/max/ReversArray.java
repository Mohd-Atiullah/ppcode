package max;

import java.util.Arrays;
import java.util.OptionalInt;

public class ReversArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	reversearra(arr);
	fatchingsecondelement(arr);
	
}

private static void fatchingsecondelement(int[] arr) {
	OptionalInt secondarray=Arrays.stream(arr).sorted().skip(1).findFirst();
	//Integer integer2 = numbers.stream().max((x,y)->x.compareTo(y)).get();
	System.out.println(secondarray);
	
}

private static void reversearra(int[] arr) {
	for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]);
	}
	
}
}
