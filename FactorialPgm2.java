package Pack3;

public class FactorialPgm2 {
	
	public static void main(String[] args) {

			  int number = 5;
			  int factorial = number;//4

			  for (int i = (number - 1); i > 1; i--) {
			   factorial = factorial * i;
			  }

			  System.out.println("Factorial of " + number + " is " + factorial);
			 }
			}


	