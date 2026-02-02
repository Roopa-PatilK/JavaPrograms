package Pack3;

import java.util.Scanner;

public class RightAngledTriangle {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("ENter the number of rows");
		int n=s1.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)//n=3 3-1=2
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		s1.close();

	}

}
