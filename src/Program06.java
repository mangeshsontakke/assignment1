
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program06 {
	
	/*6. Given date in dd-MM-yyyy format.
	 *   return the month in full name format(January)
		 input:"23-01-2012"
		 output:January */
	public static void main(String[] args) throws ParseException {
			
		//If input from user
		/*String userdate;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date in dd-MM-yyyy: ");
		userdate=sc.next();*/
		
		String userdate = "23-11-2012"; //Given Date
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");// to set format 
		Date dt1 = dateformat.parse(userdate); // to convert string into date format

		dateformat = new SimpleDateFormat("MMMM"); // to print month format only 
		System.out.println(dateformat.format(dt1)); //format method to print the month
		

	}

}
