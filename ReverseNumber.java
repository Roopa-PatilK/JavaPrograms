package Pack3;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n=1234;
		int reverse=0;
		
		while(n!=0)
		{
			int digit=n%10;
			//System.out.println(digit);
			reverse=reverse*10+digit;
			//System.out.println(reverse);
			n=n/10;
			System.out.println(n);
		}
		System.out.println(reverse);
	}
}

	