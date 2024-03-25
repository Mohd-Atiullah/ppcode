package max;

public class MinArray {
public static void main(String[] args) {
	
		int arr[]= {2,4,5,7,1};
		int resp = minarray(arr);
		System.out.println(resp);
	}


	public static int minarray(int items[]) {
		int min=items[0];
		for(int i=0;i<items.length;i++) {
			if(items[i]<min) {
				min=items[i];
			}
		}
	return min;
		
	}
	

}
