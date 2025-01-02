package Numbers;
//.Write a java program to calculate the product of all the odd numbers present between 1 and N.
public class Product_of_all_odd_no {
 
	public static void main(String [] args)
	{
		int n=10;
		int  product=1;
		for (int i = 1; i <= n; i++) {
			  
			if (i % 2 !=0) {
				
				product=product*i;
			}
			
		}
		System.out.println(product);
		
	}

}
