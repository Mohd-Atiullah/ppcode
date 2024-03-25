package max;

public class Maxmumandminum {
public static void main(String[] args) {
	int a[]= {2,3,46,7,1};
	int[] res= minmax(a);
	System.out.println("max "+res[0]);
	System.out.println("min "+   res[1]);
	}

	public static int[] minmax(int[] items) {
		int max=items[0];
		int min=items[0];
		for(int i=1;i<items.length;i++) {
			if(items[i]>max) {
				max=items[i];
			}else if (items[i]<min){
				min=items[i];
			}
		}
		int[] result= {max,min};
		return result;
	
}
}
