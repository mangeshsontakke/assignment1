

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program2 {
	
	/*2.Find the day(Friday) of a date input given as MM-dd-yyyy (format)
		input:12-27-2012
		output:Thursday
	 */
	public static void main(String[] args) throws ParseException {
		
		System.out.println("Enter the Date MM-dd-yyyy (format): ");
		
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat format=new SimpleDateFormat("MM-dd-yyyy"); //to set the date format given by user
		String stringdate =sc.next();// to store the user input date

		Date date=format.parse(stringdate); // to convert string into date format
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        System.out.println(simpleDateformat.format(date));
		

	}

}
