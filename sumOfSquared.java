package week1;

public class sumOfSquared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum =0;
		int pwr=0;
		for(;i<=10;i++)
		{
			sum +=i;
			pwr=sum*sum;
		}
		System.out.println(pwr);
		System.out.println(pwr-sum);
	}

}
