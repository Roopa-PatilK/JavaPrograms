package Array;

import java.util.Arrays;

public class CopyArryrevrsemanner {

	public static void main(String[] args) {
		int[] array1=new int[3];
		array1[0]=43;
		array1[1]=67;
		array1[2]=00;
		
		int[] array2=new int[array1.length];
		
		for(int i=0,j=array1.length-1;i<array1.length;i++,j--)
		{
			array2[j]=array1[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

	}

}
