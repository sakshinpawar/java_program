package Numbers;
//2.write a java program to print all the numbers between 1 and N which are multiple of 5.
public class Multiple_of_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		for (int i = 1; i <= n; i++) {
			
			if (i % 5 ==0) {
				 
				System.out.println(i);
			}
			
		}
	}

}
