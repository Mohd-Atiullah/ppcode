package max2;

public class MinMaxFinder {
	
	public static void main(String[] args) {
		 int[] numbers = {34, 78, 12, 89, 65, 0, -1, 100, 23};
		 int min=numbers[0];
		 int max=numbers[1];
		 for(int i=0;i<numbers.length;i++) {
			 if(numbers[i]<min) {
				 min=numbers[i];
			 }else if(numbers[i]>max) {
				 max=numbers[i];
			 }
		 }
		 System.out.println(" min number of array "+min +" max number of array"+max);
	}

}
