package Numbers;
//write a java program to calculate the power of N raised to P(N^P).
//n^p = 3^3=3*3*3
public class N_Power_P {

	public static void main(String[] args) {
		int n=3;
		int p=3;
		int res=1;
		for(int i=1;i<= p;i++)
		{
			res=res*n;
		}
		System.out.println(res);
		
	}

}
