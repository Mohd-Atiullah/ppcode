package max;

public class StringAtesting {
public static void main(String[] args) {
	String s1 = new String("abc"); 
	String s2 = "abc";
	String s3 = "abc";
	String s4 = s3;
	 
	 
	System.out.println(s1 == s2);
	System.out.println(s1.equals(s2));
	System.out.println(s2 == s3);
	System.out.println(s3 == s4);

}
}
