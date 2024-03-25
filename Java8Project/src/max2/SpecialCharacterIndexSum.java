package max2;

public class SpecialCharacterIndexSum {

	public static void main(String[] args) {
		String str="abcd@efg%";
		System.out.println("total "+countcharcter(str));
	}

	private static int countcharcter(String str) {
	int sum=0;
		for(int i=0;i<str.length();i++) {
			char d=str.charAt(i);
			if(!Character.isLetterOrDigit(d)) {
				sum+=i;
			}
		
	}
		return sum;
		
	}
}
