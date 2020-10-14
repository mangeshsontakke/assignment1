import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Program08 {
	/*8. A time input is received as string. 
	 *  Find if the hour format is in 12 hour format.
	 *  the suffix am/pm is case insensitive.
			input:"09:36 am"
			output:true
	 */
	public static void main(String[] args) {
		
		 String n = "11:36 AM"; 
		 String a[]=n.split(":");	// to split string into single character	
		 int h = Integer.parseInt(a[0]); // to convert into integer
		 String x = a[1];	String r = "";
		 for(int i=0;i<=1;i++)
		 {
			 r=r+x.charAt(i); //to find index
		 }
		 int m = Integer.parseInt(r);
		 
		 String j = DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.of(h,m)); // to set format
		 
		 if(n.equalsIgnoreCase(j)) // to check time
		 {
			 System.out.println("True");
		 }
		 else
		 {
			 System.out.println("False");
		 }
		 
		
		
	}

}
