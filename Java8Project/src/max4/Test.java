package max4;

public class Test {
	static int sumprodduct(int num) {
		int digit=0;
		while(num!=0) {
		digit+=num%10;
		num=num/10;
		}
		return digit;
	}
public static void main(String[] args) {
	
System.out.println("checking data "+sumprodduct(38));
}
}
