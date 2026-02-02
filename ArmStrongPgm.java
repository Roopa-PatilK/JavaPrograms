package Pack3;

import java.util.Scanner;

public class ArmStrongPgm {

	public static void main(String[] args) {
		//Scanner s1=new Scanner(System.in);
		//int num=s1.nextInt();
		int num=153;
		int backup=num;
		int sum=0;
		
		while(num>0)//153=1*1*1*5*5*5*3*3*3=153
		{
			sum=sum+(num%10)*(num%10)*(num%10);
			System.out.println(sum);
			num=num/10;
			System.out.println(sum);
			//System.out.println(num);
		}
		if(sum==backup)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not ");
		}

	}

}
