package Pack3;

public class Fibonacci2 {
	
	public static void main(String[] args) {
	
		int no=10;
		int n1=0;
		int n2=1;
		
		System.out.println("Fibonacci series till "+no);
		
		for(int i=0;i<=no;i++)
		{
			int n3 = n1+n2;//Swap numbers 
			n1=n2;
			n2=n3;
			System.out.print(n1+ " ");
			
			
	}
	}
}	