//WAP to find the average for the numbers present in the array type
package Array;

public class AverageOfArray {

	public static void main(String[] args) {
		int sum=0;
		int[] n1=new int[3];
		n1[0]=20;
		n1[1]=50;
		n1[2]=30;
		
		for(int i=0;i<n1.length;i++)
		{
			sum=sum+n1[i];
			
			
		}
		System.out.println("sum:"+sum);
		double avg=sum/n1.length;
		System.out.println("Average:"+avg);
		 
		
	}

}
