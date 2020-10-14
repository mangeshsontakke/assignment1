
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

	/*7. Two dates are given as input in "yyyy-MM-dd" format. Find the number of months between the two dates
		input1:"2012-12-01"
		input2:"2012-01-03"
		output:11*/
		
public class Program07 {
	public static void main(String[] args) {
	
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd"); // date format
		LocalDate fromDate = LocalDate.of(2012,01, 01); // to get system date (localdate)
		LocalDate toDate = LocalDate.of(2012, 12, 01);
		
		Period diff = Period.between(fromDate, toDate); // to get difference in build period 
		System.out.println(+diff.getYears() +" Year(s) and " + diff.getMonths() +" Month(s)\n");
		
	}

}
