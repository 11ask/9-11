package exercices;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=15;
		int z=20;
		if(x>y&&x>z)
		{
			System.out.println("First No is greatest");
		}
		else {
			if(y>x&&y>z)
			{
				System.out.println("Second No is the greatest");
			}
			else
			{
				System.out.println("Third No is the greatest");
			}
		}

	}

}
