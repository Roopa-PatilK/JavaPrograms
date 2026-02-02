package Array;

public class FindNumber {

	public static void main(String[] args) {
		int[] i1=new int[5];
		i1[0]=10;
		i1[1]=20;
		i1[2]=30;
		i1[3]=40;
		i1[4]=50;
		
		int notocheck=20;
		boolean found=false;
		for(int i=0;i<i1.length;i++)
		{
			System.out.println("Number is: "+i1[i]);
			if(notocheck==i1[i])
			{
				System.out.println("True: The number present at the index: "+i);
				found=true;
				break;
			}
			
		}
		if(!found)
		{
			System.out.println("Sorry the Enetred element is not present");
		}
	}
}
