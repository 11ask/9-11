package week1;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 12;
	    int num2 = 18;
	    int gcd = 0;
	    int lcm = 0;
	    for (int i = 1; i <= num1 && i <= num2; ++i) {
	      if (num1 % i == 0 && num2 % i == 0) {
	        gcd = i;
	      }
	    }
	    lcm = (num1 * num2) / gcd;
	    System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
	    System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);


	}

}
