package max;

public class MaxArray {
	public static void main(String[] args) {
		int a[]= {1,3,5,7};
		int resp = getmax(a);
		System.out.println("maxum "+resp);
		
	}

	public static int getmax(int[] item) {
		int max=item[0];
		for(int i=0;i<item.length;i++) {
			if(item[i]>max)
				max=item[i];
		}
		return max;
	}
}
