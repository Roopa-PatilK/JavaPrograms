
//WAP to accept the value of array at runtime 
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RuntimeAccept {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("ENter the size of an array");
		int[] rollno=new int[s1.nextInt()];
		for(int i=0;i<=rollno.length-1;i++)
		{
			System.out.println("ENter the rollno at index position:"+i);
			rollno[i]=s1.nextInt();
		}
		System.out.println("Array output is:");
		System.out.println(Arrays.toString(rollno));
	}

}
