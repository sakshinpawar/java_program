package Numbers;
//write a java program to check whether the given number is palindrome
//1221= after reversing the number 1221.
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1221;
		int copy=num;
		int result=0;
		while(num !=0)
		{
			int rem=num % 10;//1//2
			result=(result *10) +rem;
			num=num/10;
		}
		System.out.println(result);
 		if(result == copy) 
 		{
 			System.out.println("No is Panlindrome");
 			
 		}
 		else
 		{
 			System.out.println("No is not Panlindrome");
 		}
	}

}
