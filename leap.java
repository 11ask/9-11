package exercices;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Year to be checked
        int year = 1996;
        boolean leap = false;

        // If the year is divisible by 4
        if (year % 4 == 0) {
            // If the year is a century year
            if (year % 100 == 0) {
                // If the year is divisible by 400, it's a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            // If the year is not a century year, it's a leap year
            else
                leap = true;
        }
        // If the year is not divisible by 4, it's not a leap year
        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }


	}