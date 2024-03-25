package max3;

public class StringReverse {
	public static void main(String[] args) {
		String str="Good";
	
		reverseString(str.toCharArray());
		
	}
	
	public static void reverseString(char[] s) {
	    int i=0;
	    int j=s.length-1;
	    while (i < j){
	        char temp=s[i];
	        s[i]=s[j];
	        s[j]=temp;
	        i++;
	        j--;
	        
	    }
	}

}
