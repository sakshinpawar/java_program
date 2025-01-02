package Numbers;
//write a java program to calculate the sum of the squares of each digit in a given number//1+4+9+16=30
public class Sum_of_Sq_all_digit {

	public static void main(String[] args) {
		int num=12345;
		int sum=0;
		
		while(num !=0)
		{
			int rem=num % 10;
			 sum +=rem*rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
