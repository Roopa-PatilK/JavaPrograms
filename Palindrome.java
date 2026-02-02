package Pack3;

public class Palindrome {

	public static void main(String[] args) {
		
		String s1="MOM";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			s2=s2+c;
			
		}
		System.out.println("String is:"+s2);
		if(s1.equals(s2))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not Palindrome");
		}

	}

}
