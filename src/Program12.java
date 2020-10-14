import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program12 {
	
	/*12.accept a string and find if it is of date format "dd/mm/yyyy".
		input:01/13/2012
		output:false
	 */
	
		public static void main(String[] args) {
			SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy");// user given format
			sm.setLenient(false);// check date and time formation(before 8 version we use, no need 9 and above version)
			String givendate = "01-13-2012";
			try{
				Date date = sm.parse(givendate);// to convert date into string
				System.out.println("true");
			}catch(ParseException e){
				System.out.println("False");
				
			}
			
		}
		
	}	

