package Numbers;
//write a java program to print factors of given number
public class Factors_Of_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//8=1,2,4,8
		//20=1,2,4,5,10,20   //15=1,3,5,15
		//using method
		factor(20);

	}

	public static void factor(int num)
	{
		
		int i;
		for( i=1;i <= num ;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
			
		}
		
		
	}
	
}
