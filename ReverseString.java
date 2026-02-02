package Pack3;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1="Krishiv";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c1=s1.charAt(i);
			s2=s2+c1;
			
		}
		System.out.println("Reverse string is:"+s2);

	}
}

	