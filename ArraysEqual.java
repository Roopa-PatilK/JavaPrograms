//WAP to check if the 2 arrays are equal
package Array;

import java.util.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {
		
		int[] n1=new int[3];
		n1[0]=11;
		n1[1]=11;
		n1[2]=11;
		
		int[] n2=new int[3];
		n2[0]=11;
		n2[1]=11;
		n2[2]=11;
		
		boolean b=Arrays.equals(n1, n2);
		if(b==true)
		{
			System.out.println("Array is equal");
		}
		else
		{
			System.out.println("Array is not equal");
		}
			

	}

}
