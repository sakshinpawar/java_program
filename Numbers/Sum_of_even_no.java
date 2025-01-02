package Numbers;
//write a java program to calculate sum of even digits in a given number
public class Sum_of_even_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13456;
		int sum =0;
		
		while(num != 0)
		{
			int rem=num % 10;
			
			if(rem % 2 ==0)
			{
				sum=sum+rem;
			}
			
			num=num/10;
		}
		System.out.println(sum);
	
		

	}

}
