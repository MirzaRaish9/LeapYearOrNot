public class leapyr {
	
	public static boolean isLeapYear(int  year)
	{
		
		
		if (year <=0 || year>=9999) {
			return true;
		} else if ((year % 4 ==0) && (year % 100 ==0) && (year % 400 == 0)){
		 System.out.println("this is leap year");
		} else {
			System.out.println("this is not a leap year");
		return false;
		}
		return true;
	
}
	
}
	
