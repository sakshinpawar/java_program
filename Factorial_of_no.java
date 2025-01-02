package Numbers;
//write a java program to calculate factorial of given number
public class Factorial_of_no {

	public static void main(String[] args) {
		int num=6;
		int fact=1;
		for(int i=1; i<=num ;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
