package max;

public class PalindromString {
public static void main(String[] args) {
String input2="My name is nitin and I can speak malayalam";
String input="nitin is";
String[] str=input.split(" ");
for(String word: str) {
	if(isPalindrome(word)) {
		System.out.println("is palindrome " + word);
	}else {
		System.out.println("is not palindrom "+word);
	}
}

}

public static boolean isPalindrome(String input) {
	int i1=0;int i2=input.length()-1;
	while(i2>i1) {
		System.out.println("checking data "+input.charAt(i1) +"  "+input.charAt(i2));
		if(input.charAt(i1)!=input.charAt(i2)) {
			return false;
		}
		i1++;
		i2--;
	}
	return true;
}
}
