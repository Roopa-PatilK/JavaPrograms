//WAP to copy the array from ont to another 
package Array;

import java.util.Arrays;

public class CopyArryonetoanother {

	public static void main(String[] args) {
		
		int[] array1=new int[3];
		array1[0]=32;
		array1[1]=88;
		array1[2]=56;
		
		int[] array2=new int[array1.length];
		
		for(int i=0;i<array1.length;i++)
		{
			array2[i]=array1[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		

	}

}
