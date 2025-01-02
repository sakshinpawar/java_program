package Numbers;
//write a java program to calculate the product of odd digits in a given number
public class Product_of_all_odd_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int product=1;
		
		while(num !=0)
		{
			int rem=num % 10;
			
			if(rem % 2 != 0)
			{
				product=product*rem;
			}
			num=num/10;
			
		}
		System.out.println(product);
		

	}

}
