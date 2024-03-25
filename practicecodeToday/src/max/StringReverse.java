package max;

public class StringReverse {

	public static void main(String[] args) {
		String str="Greeks";
		String reverse=reverseWord(str);
		System.out.println(reverse);
		
	}

	private static String reverseWord(String str) {
	String ch="";
	for(int i=str.length()-1;i>=0;i--) {
		ch+=str.charAt(i);
	}
		return ch;
	}
}
