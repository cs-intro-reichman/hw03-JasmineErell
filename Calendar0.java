/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) 
	{
		for (int i = 1; i<=12; i++)
		{
			System.out.println("Month " + i + " has " + nDaysInMonth(i, year) + " days");
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		boolean flag = false;
		if((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) 
	{
		int num = 0;
		if(isLeapYear(year))
		{
			if (month == 2 )
			{
				num = 29;
			}
			else if(month == 4 || month == 6 || month== 9 || month == 11)
			{
				num = 31;
			}
			else
			{
				num = 30;
			}	
		}
		else
		{
			if (month == 2 )
			{
				num = 28;
			}
			else if(month == 4 || month == 6 || month== 9 || month == 11)
			{
				num = 31;
			}
			else
			{
				num = 30;
			}	
		}
		return num;
	}
		// {
		// 	if(month<=7 && month%2==1)
		// 	{
		// 		num = 31;
		// 	}
		// 	else if (month<=7 && month%2==0 && month != 2)
		// 	{
		// 		num = 30;
		// 	}
		// 	else if (month>=8 && month%2==0)
		// 	{
		// 		num = 31;
		// 	}
		// 	else if(month>=8 && month%2==1)
		// 	{
		// 		num = 30;
		// 	}
		// 	else
		// 	{
		// 		num = 29;
		// 	}
		// }
		// else
		// {
		// 	if(month<=7 && month%2==1)
		// 	{
		// 		num = 31;
		// 	}
		// 	else if (month<=7 && month%2==0 && month != 2)
		// 	{
		// 		num = 30;
		// 	}
		// 	else if (month>=8 && month%2==0)
		// 	{
		// 		num = 31;
		// 	}
		// 	else if(month>=8 && month%2==1)
		// 	{
		// 		num = 30;
		// 	}
		// 	else
		// 	{
		// 		num = 28;
		// 	}
		// }
		// 	return num;			
		// }
	}


