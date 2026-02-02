package Pack3;

public class Fibonacci {
	
	public static void main(String[] args) {
	
		int n=10;
		int n1=0;
		int n2=1;
		System.out.println("Fibonacci series till " +n);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(n1+" ");
			int n3=n1+n2;//Swap numbers
			n1=n2;
			n2=n3;
		}
	}
}	