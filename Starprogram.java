package Pack3;

public class Starprogram {

	public static void main(String[] args) 
	{
		/*for (int i = 1; i <= 5; i++) {//rows
			for (int j = 1; j <= 5 - i + 1; j++) {//column
				System.out.print("*");
			}
			System.out.println();
			*/
         int n=5;
         for(int i1=0;i1<=n;i1++)
         {
        	 for(int j=i1;j<n;j++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int k=0;k<2*i1-1;k++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         
	

	}
}


