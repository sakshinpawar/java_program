package Numbers;
//.write a java program to count the number of digits in a given number.
public class Count_Number_Of_Digits {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num=123457;
		int count=0;
		while (num != 0) {
			
			num=num / 10;
			count++;
		}
		System.out.println(count);

	}

}
