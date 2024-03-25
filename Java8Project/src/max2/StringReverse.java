package max2;

public class StringReverse {
public static void main(String[] args) {
	String str="good";
	String d="";
	for(int i=str.length()-1;i>=0;i--) {
		
	 d+= str.charAt(i);
		
	}
	System.out.println(d);
}
}
