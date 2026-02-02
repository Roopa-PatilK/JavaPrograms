package Array;

public class FindindexofArryusingforeachloop {

	public static void main(String[] args) {
		String s1[]= {"Prathvi","nanda","Damodar"};
		 int index=0;
		for(String s:s1)
		{
			if(s.equals("Damodar"))
				System.out.println(index+" "+s);
			index++;
		}
		
	}

}
